package com.javarush.task.pro.task06.task0608;
import java.lang.Math;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static long cube(long outNumber) {
        //Math.pow(outNumber, 3);
        outNumber = outNumber * outNumber * outNumber;
        return outNumber;
    }
}
