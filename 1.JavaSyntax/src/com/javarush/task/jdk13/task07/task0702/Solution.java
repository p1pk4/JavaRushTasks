package com.javarush.task.jdk13.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строк в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        list[0] = "one";
        list[1] = "two";

        for (int i = 2; i < list.length; i++)
        {
            list[i] = reader.readLine();
        }

        for (int i = list.length - 1; i >= 0; i--)
        {
            System.out.println(list[i]);
        }

    }
}