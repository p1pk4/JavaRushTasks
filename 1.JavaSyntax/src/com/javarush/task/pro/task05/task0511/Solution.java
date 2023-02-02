package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        multiArray = new int[s][];

        for (int i = 0; i < s; i++) {
            int t = scan.nextInt();
            multiArray[i] = new int[t];
            System.out.println(multiArray[i]);
        }
    }
}