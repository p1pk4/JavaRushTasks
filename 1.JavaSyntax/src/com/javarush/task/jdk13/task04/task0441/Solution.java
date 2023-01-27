package com.javarush.task.jdk13.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее такое среднее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(reader.readLine());
        int two = Integer.parseInt(reader.readLine());
        int three = Integer.parseInt(reader.readLine());
        
        int coutnOne = 0;


        if (one > two){
            coutnOne = one;
            System.out.println(coutnOne);
        }

    }
}
