package com.javarush.task.jdk13.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
