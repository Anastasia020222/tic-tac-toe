package org.example.general;

public class LocationElements {

    //проверяем, что на карте выбранный параметр не совпал с занятой
    public static boolean checkLocationParameters(int x, int y, String[][] board) {
        System.out.println(board[y][x]);
        System.out.println(!board[y][x].equals(" * "));
        if (!board[y][x].equals(" * ")) {
            System.out.println("Эта яцейка уже занята. Выбери другую.");
            return false;
        }
        return true;
    }

    public static boolean checkEmptyCell(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.println(board[i][j].equals(" * "));
                if (board[i][j].equals(" * ")) {
                    return true;
                }
            }
        }
        System.out.println("Игра завершилась.");
        return false;
    }
}
