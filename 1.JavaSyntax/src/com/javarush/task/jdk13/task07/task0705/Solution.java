package com.javarush.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigarray = new int[20];
        int[] one = new int[10];
        int[] two = new int[10];
        int copyElements = 10;


        /* Занесение значений веденных с клавиатуры в массив по индексу  */
        for (int i = 0; i < bigarray.length; i++)
        {
            bigarray[i] = Integer.parseInt(reader.readLine());
        }

        System.arraycopy(bigarray, 0, one, 0, copyElements);
        System.arraycopy(bigarray, 10, two, 0, copyElements);

        for (int i = 0; i < two.length; i++) {
            System.out.println(two[i]);
        }
    }
}
