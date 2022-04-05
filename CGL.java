package com.company;

public class CGL {
    // Variables //
    private int[][] grid;
    private int gen = 1;

    // Constructors //
    // Default constructor
    public CGL() {
        grid = new int[8][8];
    }

    // Constructor w/ a preset generation
    public CGL(int[][] g){
        grid = g;
    }

    // Getters and setters //
    public int[][] getGrid() {return grid;}
    public int getGen() {return gen;}
    public void setGrid(int[][] g) {grid = g;}
    public void setGen(int g) {gen = g;}

    // Methods //
    // Simulating the next generation
    public void nextGen(){
        int[][] temp = new int[grid[0].length][grid.length];

        // ** Insert looping, out of bounds checking, and rules here ** //
    }

    public String toString(){
        String temp = "Generation " + gen + "\n";
        for (int cellRow : grid[0]) {
            for (int cellCol : grid[1]) {
                temp += grid[cellRow][cellCol] + "  ";
            }
            temp += "\n";
        }
        return temp;
    }
}
