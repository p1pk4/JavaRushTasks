package com.javarush.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улица и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] houses = new int[15];
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < houses.length; i++) {
            houses[i] = Integer.parseInt(reader.readLine());

            if (i % 2 == 0) {
                evenSum += houses[i];
            }
            else {
                oddSum += houses[i];
            }
        }

        if (oddSum > evenSum) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        if (oddSum < evenSum) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}