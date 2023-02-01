package com.javarush.task.jdk13.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Два массива
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readre = new BufferedReader(new InputStreamReader(System.in));

        String[] strngs = new String[10];
        int[] nmbs = new int[10];

        for (int i = 0; i < strngs.length; i++) {
            strngs[i] = readre.readLine();
            for (int j = 0; j < nmbs.length; j++) {
                nmbs[j] = strngs[i].length();
            }
            System.out.println(nmbs[i]);
        }
    }
}
