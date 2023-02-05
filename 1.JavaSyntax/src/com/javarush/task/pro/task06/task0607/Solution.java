package com.javarush.task.pro.task06.task0607;

/* 
Добро пожаловать! Но не всем.
*/

public class Solution {

    public static void main(String[] args) {
        
    }

    public static void signIn(String username){
        String notName = "user";
        if (username.equals(notName)) {
            return;
        }
        else {
            System.out.println("Очень скучали по Вам, " + username);
            System.out.println("Добро пожаловать " + username);
        }
    }
}
