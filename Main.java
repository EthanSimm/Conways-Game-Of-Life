package com.company;

public class Main {

    public static void main(String[] args) {
	    // Test code
        int[][] testGrid = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
        };
        CGL testGame = new CGL(testGrid);
        System.out.println(testGame);
        testGame.nextGen();
        System.out.println(testGame);
        testGame.nextGen();
        System.out.println(testGame);
        testGame.nextGen();
        System.out.println(testGame);
    }
}
