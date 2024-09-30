package de.tinf.io;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class ConsoleUtilsTest {
    @Test
    void testPrint2DArray() {
        System.out.println("testPrint2DArray:");
        Integer[][] array = new Integer[][] {
                { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 },
                { 1, 11, 21, 31, 41, 51, 61, 71, 81, 91, 101 },
                { 2, 12, 22, 32, 42, 52, 62, 72, 82, 92, 102 },
                { 3, 13, 23, 33, 43, 53, 63, 73, 83, 93, 103 },
                { 4, 14, 24, 34, 44, 54, 64, 74, 84, 94, 104 },
                { 5, 15, 25, 35, 45, 55, 65, 75, 85, 95, 105 },
                { 6, 16, 26, 36, 46, 56, 66, 76, 86, 96, 106 },
                { 7, 17, 27, 37, 47, 57, 67, 77, 87, 97, 107 },
                { 8, 18, 28, 38, 48, 58, 68, 78, 88, 98, 108 },
                { 9, 19, 29, 39, 49, 59, 69, 79, 89, 99, 109 },
                { 10, 110, 210, 310, 410, 510, 610, 710, 810, 910, 1010 },
        };

        ConsoleUtils.print2DArray(array);
    }

    @Test
    void testPrint2DArrayVariableXLength() {
        System.out.println("testPrint2DArrayVariableXLength:");
        Integer[][] array = new Integer[][] {
                { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 },
                { 1, 11, 21, 31, 41, 51, 61 },
                { 2, 12, 22, 32, 42, 52, 62, 72, 82, 92, 102 },
                { 3, 13, 23, 33, 43, 53, 63, 73, 83, 93, 103 },
                { 4, 14, 24, 34, 44, 54, 64, 74, 84, 94, 104 },
                { },
                { 6, 16, 26, 36, 46, 56, 66, 76, 86, 96, 106 },
                { 7, 17, 27, 37, 47, 57, 67, 77, 87, 97, 107 },
                { 8, 18, 28 },
                { 9, 19, 29, 39, 49, 59, 69, 79, 89, 99, 109 },
                { 10, 110, 210, 310, 410, 510, 610, 710, 810, 910, 1010 },
        };

        ConsoleUtils.print2DArray(array);
    }

    @Test
    void testPrint2DArrayCustomFormatter() {
        System.out.println("testPrint2DArrayCustomFormatter:");
        Integer[][] array = new Integer[][] {
                { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 },
                { 1, 11, 21, 31, 41, 51, 61, 71, 81, 91, 101 },
                { 2, 12, 22, 32, 42, 52, 62, 72, 82, 92, 102 },
                { 3, 13, 23, 33, 43, 53, 63, 73, 83, 93, 103 },
                { 4, 14, 24, 34, 44, 54, 64, 74, 84, 94, 104 },
                { 5, 15, 25, 35, 45, 55, 65, 75, 85, 95, 105 },
                { 6, 16, 26, 36, 46, 56, 66, 76, 86, 96, 106 },
                { 7, 17, 27, 37, 47, 57, 67, 77, 87, 97, 107 },
                { 8, 18, 28, 38, 48, 58, 68, 78, 88, 98, 108 },
                { 9, 19, 29, 39, 49, 59, 69, 79, 89, 99, 109 },
                { 10, 110, 210, 310, 410, 510, 610, 710, 810, 910, 1010 },
        };

        ConsoleUtils.print2DArray(array, (element, x, y) -> {
            if (y % 2 == 0) {
                return " " + ConsoleANSICode.BG_BLUE + element.toString() + ConsoleANSICode.COLOR_OFF;
            } else {
                return " " + ConsoleANSICode.BG_CYAN + element.toString() + ConsoleANSICode.COLOR_OFF;
            }
        });
    }

    @Test
    void testPrintArray() {
        System.out.println("testPrintArray:");
        Integer[] array = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ConsoleUtils.printArray(array);
    }

    @Test
    void testPrintArrayCustomFormatter() {
        System.out.println("testPrintArrayCustomFormatter:");
        Integer[] array = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ConsoleUtils.printArray(array, (element, index) -> {
            return element + " at " + index;
        });
    }
}
