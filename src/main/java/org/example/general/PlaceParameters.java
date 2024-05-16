package org.example.general;

import static org.example.general.Constants.O;
import static org.example.general.Constants.X;

public class PlaceParameters {

    //расставляем на доске
    public static void placeParameters(String[][] board, int x, int y, boolean bot) {
        if (!bot) {
            for (int i = 0; i < board.length; i++) {
                board[y][x] = X;
            }
        } else {
            for (int i = 0; i < board.length; i++) {
                board[y][x] = O;
            }
        }
    }

    //получение координаты X
    public static int getCoordinatesX(int coordinates) {
        int x = 0;
        for (Parameters p : Parameters.values()) {
            if (p.getLocation() == coordinates) {
                x = p.getX();
            }
        }
        return x;
    }

    //получение координаты Y
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
