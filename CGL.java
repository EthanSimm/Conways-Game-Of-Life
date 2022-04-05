package com.company;

public class CGL {
    // Variables //
    private int[][] grid;

    // Constructors //
    // Default constructor
    public CGL() {
        grid = new int[8][8];
    }

    // Getters and setters //
    public int[][] getGrid() {return grid;}
    public void setGrid(int[][] g) {grid = g;}

    // Methods //
    public String toString(){   // Not most effective
        String temp = "";
        for (int i = 0; i < grid[0].length; i++)
        {
            for (int j = 0; j < grid.length; j++)
            {
                temp += grid[i][j] + "  ";
            }
            temp += "\n";
        }
        return temp;
    }
}
