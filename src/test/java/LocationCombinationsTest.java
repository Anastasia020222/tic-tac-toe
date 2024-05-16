import org.example.general.InitializeBoard;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LocationCombinationsTest {

    @Test
    @DisplayName("Проверяем выигрыш при комбинации в первой строке")
    public void checkLocationCombinationFirstLine() {
        InitializeBoard initializeBoard = new InitializeBoard();
        String[][] fakeBoard = {
                {" X ", " X ", " X "},
                {" O ", " O ", " * "},
                {" O ", " * ", " * "}
        };

        assertTrue(initializeBoard.checkFinishResults(fakeBoard, " X "), "Комбинация в первой строке вернула false");
    }

    @Test
    @DisplayName("Проверяем выигрыш при комбинации в первой строке")
    public void checkLocationCombinationSecondLine() {
        InitializeBoard initializeBoard = new InitializeBoard();
        String[][] fakeBoard = {
                {" * ", " * ", " * "},
                {" X ", " X ", " X "},
                {" O ", " * ", " * "}
        };

        assertTrue(initializeBoard.checkFinishResults(fakeBoard, " X "), "Комбинация вo второй строке вернула false");
    }

    @Test
    @DisplayName("Проверяем выигрыш при комбинации в первой строке")
    public void checkLocationCombinationThirdLine() {
        InitializeBoard initializeBoard = new InitializeBoard();
        String[][] fakeBoard = {
                {" * ", " * ", " * "},
                {" * ", " * ", " * "},
                {" X ", " X ", " X "}
        };

        assertTrue(initializeBoard.checkFinishResults(fakeBoard, " X "), "Комбинация в третьей строке вернула false");
    }

    @Test
    @DisplayName("Проверяем выигрыш при комбинации в первой строке")
    public void checkLocationCombinationFirstColumn() {
        InitializeBoard initializeBoard = new InitializeBoard();
        String[][] fakeBoard = {
                {" X ", " * ", " * "},
                {" X ", " * ", " * "},
                {" X ", " * ", " * "}
        };

        assertTrue(initializeBoard.checkFinishResults(fakeBoard, " X "), "Комбинация в первой колонке вернула false");
    }

    @Test
    @DisplayName("Проверяем выигрыш при комбинации в первой строке")
    public void checkLocationCombinationSecondColumn() {
        InitializeBoard initializeBoard = new InitializeBoard();
        String[][] fakeBoard = {
                {" * ", " X ", " * "},
                {" * ", " X ", " * "},
                {" * ", " X ", " * "}
        };

        assertTrue(initializeBoard.checkFinishResults(fakeBoard, " X "), "Комбинация в второй колонке вернула false");
    }

    @Test
    @DisplayName("Проверяем выигрыш при комбинации в первой строке")
    public void checkLocationCombinationThirdColumn() {
        InitializeBoard initializeBoard = new InitializeBoard();
        String[][] fakeBoard = {
                {" * ", " * ", " X "},
                {" * ", " * ", " X "},
                {" * ", " * ", " X "}
        };

        assertTrue(initializeBoard.checkFinishResults(fakeBoard, " X "), "Комбинация в третьей колонке вернула false");
    }

    @Test
    @DisplayName("Проверяем выигрыш при комбинации в первой строке")
    public void checkLocationCombinationFirstDiagonally() {
        InitializeBoard initializeBoard = new InitializeBoard();
        String[][] fakeBoard = {
                {" * ", " * ", " X "},
                {" * ", " X ", " * "},
                {" X ", " * ", " * "}
        };

        assertTrue(initializeBoard.checkFinishResults(fakeBoard, " X "), "Комбинация по диагонале 1 вернула false");
    }

    @Test
    @DisplayName("Проверяем выигрыш при комбинации в первой строке")
    public void checkLocationCombinationSecondDiagonally() {
        InitializeBoard initializeBoard = new InitializeBoard();
        String[][] fakeBoard = {
                {" X ", " * ", " * "},
                {" * ", " X ", " * "},
                {" * ", " * ", " X "}
        };

        assertTrue(initializeBoard.checkFinishResults(fakeBoard, " X "), "Комбинация по диагонале 2 вернула false");
    }
}
