package com.javarush.task.jdk13.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из чисел в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] list = new String[10];
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++)
        {
            list[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = list.length - 1; i >= 0; i--)
        {
            System.out.println(list[i]);
        }
    }
}

