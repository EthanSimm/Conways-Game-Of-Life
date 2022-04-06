package com.company;

public class CGL {
    // Variables //
    private int[][] grid;
    private int gen = 1;
    private int rows;
    private int cols;

    // Constructors //
    // Default constructor
    public CGL() {
        grid = new int[8][8];
        rows = grid[0].length;
        cols = grid.length;
    }

    // Constructor w/ a preset generation
    public CGL(int[][] g){
        grid = g;
        rows = grid[0].length;
        cols = grid.length;
    }

    // Getters and setters //
    public int[][] getGrid() {return grid;}
    public int getGen() {return gen;}
    public int getRows() {return rows;}
    public int getCols() {return cols;}
    public void setGrid(int[][] g) {grid = g;}
    public void setGen(int g) {gen = g;}
    public void setRows(int r) {rows = r;}
    public void setCols(int c) {cols = c;}

    // Methods //
    // Simulating the next generation
    public void nextGen(){
        int[][] temp = new int[rows][cols];

        // Looping through the array
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                // Checking the cell's neighbors
                int aliveNeighbors = 0;

                for (int k = -1; k <= 1; k++){
                    for (int l = -1; l <= 1; l++){
                        // Preventing out of bounds and preventing the cell itself to be checked as a neighbor
                        if (((i + k >= 0) && (j + l >= 0)) && ((i + k < rows) && (j + l < cols)) && ((k != 0) || (l != 0))){
                            aliveNeighbors += grid[i + k][j + l];
                        }
                    }
                }

                // Implementing the rules
                // live cell dies due to loneliness
                if (grid[i][j] == 1 && aliveNeighbors < 2){
                    temp[i][j] = 0;
                }
                // Live cell dies due to overcrowding
                else if (grid[i][j] == 1 && aliveNeighbors > 3){
                    temp[i][j] = 0;
                }
                // Dead cell is born due to neighbors
                else if (grid[i][j] == 0 && aliveNeighbors == 3){
                    temp[i][j] = 1;
                }
                // No change to the cell
                else{
                    temp[i][j] = grid[i][j];
                }
            }
        }
        // Generation has increased and overwriting previous generation
        gen++;
        grid = temp;
    }

    public String toString(){
        String temp = "Generation " + gen + "\n";
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                temp += grid[i][j] + "  ";
            }
            temp += "\n";
        }
        return temp;
    }
}
