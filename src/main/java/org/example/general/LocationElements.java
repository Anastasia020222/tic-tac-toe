package org.example.general;

import static org.example.general.Constants.EMPTY_CELL;

public class LocationElements {

    //проверяем, что на карте выбранная координата свободна
    public static boolean checkLocationParameters(int x, int y, String[][] board) {
        if (!board[y][x].equals(EMPTY_CELL)) {
            System.out.println("Эта яцейка уже занята. Выбери другую.");
            return false;
        }
        return true;
    }

    //проверяем, заполнена доска или нет
    public static boolean checkEmptyCell(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals(EMPTY_CELL)) {
                    return true;
                }
            }
        }
        System.out.println("Игра завершилась. Ничья!");
        return false;
    }
}
