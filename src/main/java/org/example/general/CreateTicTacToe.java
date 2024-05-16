package org.example.general;

public interface CreateTicTacToe {

    void createBoard();

    void renderingManual(String[][] board);

    void renderingBot(String[][] board);

    boolean checkFinishResults(String[][] board, String el);

    void printResults(String[][] board);
}
