package org.example.general;

import java.util.Random;
import java.util.Scanner;

import static org.example.general.Constants.*;
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
                board[i][k] = EMPTY_CELL;
            }
        }
        printResults(board);

        while (checkEmptyCell(board)) {
            renderingManual(board);
            if (getWinner(board, X)) {
                break;
            }
            renderingBot(board);
            if (getWinner(board, O)) {
                break;
            }
        }
    }

    //получение и отрисовка Х
    @Override
    public void renderingManual(String[][] board) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        do {
            System.out.println("Введи параметры для установки - X (от 1 до 9)");
            int getLocation = scanner.nextInt();
            x = getCoordinatesX(getLocation);
            y = getCoordinatesY(getLocation);
            if (!checkEmptyCell(board)) {
                break;
            }
        } while (!checkLocationParameters(x, y, board));
        placeParameters(board, x, y, false);
        printResults(board);
    }

    //получение и отрисовка Y рандомно
    @Override
    public void renderingBot(String[][] board) {
        Random rand = new Random();
        int x;
        int y;
        do {
            System.out.println("Ходит бот. Установка - О");
            x = getCoordinatesX(rand.nextInt(10));
            y = getCoordinatesY(rand.nextInt(10));
            if (!checkEmptyCell(board)) {
                break;
            }
        } while (!checkLocationParameters(x, y, board));
        placeParameters(board, x, y, BOT);
        printResults(board);
    }

    //проверка выигрыша
    @Override
    public boolean checkFinishResults(String[][] board, String el) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(el) && board[i][1].equals(el) && board[i][2].equals(el)) {
                return true;
            }
            for (int j = 0; j < 3; j++) {
                if (board[0][j].equals(el) && board[1][j].equals(el) && board[2][j].equals(el)) {
                    return true;
                }
            }
        }

        if (board[0][2].equals(el) && board[1][1].equals(el) && board[2][0].equals(el)) {
            return true;
        }
        if (board[0][0].equals(el) && board[1][1].equals(el) && board[2][2].equals(el)) {
            return true;
        }
        return false;
    }

    public boolean getWinner(String[][] board, String result) {
        if (checkFinishResults(board, result)) {
            if (result.equals(" X ")) {
                System.out.println("Выиграли X!");
                return true;
            }
            if (result.equals(" O ")) {
                System.out.println("Выиграли O!");
                return true;
            }
        }
        return false;
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
