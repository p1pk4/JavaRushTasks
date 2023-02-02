package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int a = 0; a < result[i].length; a++) {
                result[i][a] = i + a;
            }
        }
        /* for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        } */
        /* equivalent code without using the foreach loop */
        for (int j = 0; j < result.length; j++) {
            for (int k = 0; k < result[j].length; k++) {
                System.out.print(result[j][k] + " ");
            }
            System.out.println();
        }
    }
}
