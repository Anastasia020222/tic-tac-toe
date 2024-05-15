package org.example.general;

import java.util.Random;
import java.util.Scanner;

import static org.example.general.LocationElements.checkEmptyCell;
import static org.example.general.LocationElements.checkLocationParameters;
import static org.example.general.PlaceParameters.*;

public class InitializeBoard implements CreateTicTacToe {
    //создание доски
    @Override
    public void createBoard() {
        String[][] board = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                board[i][k] = " * ";
            }
        }

        while (checkEmptyCell(board)) {
            renderingManual(board);
            renderingBot(board);
            printResults(board);
        }
    }

    //получение и отрисовка Х
    @Override
    public void renderingManual(String[][] board) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        do {
            System.out.println("Введи параметры для установки X (от 0 до 9)");
            int getLocation = scanner.nextInt();
            x = getCoordinatesX(getLocation);
            y = getCoordinatesY(getLocation);
            System.out.println("x " + x);
            System.out.println("y " + y);
        } while (!checkLocationParameters(x, y, board));
        placeParameters(board, x, y, false);
    }

    //получение и отрисовка Y ботом
    @Override
    public void renderingBot(String[][] board) {
        Random rand = new Random();
        int x;
        int y;
        boolean bot = true;
        do {
            System.out.println("Установка 'О' ботом.");
            x = getCoordinatesX(rand.nextInt(10));
            y = getCoordinatesY(rand.nextInt(10));
            System.out.println("x2 " + x);
            System.out.println("y2 " + y);
        } while (!checkLocationParameters(x, y, board));
        placeParameters(board, x, y, bot);
    }

    //отрисовка доски
    @Override
    public void printResults(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
