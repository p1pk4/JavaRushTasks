package com.javarush.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Любимые настолки
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Шахматы";
        collection[0] = chess;

        BoardGame dnd = new BoardGame();
        dnd.name = "dnd";
        collection[1] = dnd;

        BoardGame heroes = new BoardGame();
        heroes.name = "heroes3";
        collection[2] = heroes;

        BoardGame lines = new BoardGame();
        lines.name = "Lines";
        collection[3] = lines;

        BoardGame cirk = new BoardGame();
        cirk.name = "cirk";
        collection[4] = cirk;

        System.out.println(Arrays.toString(collection));
    }
}