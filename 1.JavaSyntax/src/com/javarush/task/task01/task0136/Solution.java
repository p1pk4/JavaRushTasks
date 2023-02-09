package com.javarush.task.task01.task0136;

/* 
Да хоть на Луну!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        final double GRAVITY_ON_MOON= 0.17;
        return earthWeight * GRAVITY_ON_MOON;
    }
}