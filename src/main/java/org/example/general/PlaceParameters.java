package org.example.general;

public class PlaceParameters {

    //расставляем на доске
    public static void placeParameters(String [][] board, int x, int y, boolean bot) {
        if (!bot) {
            for (int i = 0; i < board.length; i++) {
                board[y][x] = " X ";
            }
        } else {
            for (int i = 0; i < board.length; i++) {
                board[y][x] = " O ";
            }
        }
    }

    public static int getCoordinatesX(int coordinates) {
        int x = 0;
        for (Parameters p : Parameters.values()) {
            if (p.getLocation() == coordinates) {
                x = p.getX();
            }
        }
        return x;
    }

    public static int getCoordinatesY(int coordinates) {
        int y = 0;
        for (Parameters p : Parameters.values()) {
            if (p.getLocation() == coordinates) {
                y = p.getY();
            }
        }
        return y;
    }
}
