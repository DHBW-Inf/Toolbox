package de.tinf.io;

import de.tinf.function.Function2;
import de.tinf.function.Function3;
import de.tinf.typeExtension.StringExtensions;

public class ConsoleUtils {
    // TODO: Support primitive types.
    // TODO: Change formatters to custom interfaces.

    public static <T> void printArray(T[] array) {
        ConsoleUtils.printArray(array, (element, index) -> element.toString() + " ");
    }

    public static <T> void printArray(T[] array, Function2<T, Integer, String> formatter) {
        System.out
                .println(String.format("%1$sPrinting array of length %2$s%3$s%5$d%4$s%1$s.%2$s", ConsoleANSICode.DIM_ON,
                        ConsoleANSICode.DIM_OFF, ConsoleANSICode.FG_YELLOW, ConsoleANSICode.COLOR_OFF, array.length));
        if (array.length == 0) {
            return;
        }

        final int lengthDigits = (int) (Math.log10(array.length) + 1);
        String output = "";

        for (int i = 0; i < array.length; i++) {
            output += String.format("%1$s%3$" + lengthDigits + "d %2$s%4$s\n", ConsoleANSICode.DIM_ON,
                    ConsoleANSICode.DIM_OFF, i, formatter.apply(array[i], i));
        }

        System.out.println(output);
    }

    public static <T> void print2DArray(T[][] array) {
        ConsoleUtils.print2DArray(array, (element, x, y) -> " " + element.toString());
    }

    public static <T> void print2DArray(T[][] array, Function3<T, Integer, Integer, String> formatter) {
        if (array.length == 0 || array[0].length == 0) {
            // TODO: Document this behavior.
            return;
        }

        int maxLength = 0;
        int maxX = 0;
        for (int y = 0; y < array.length; y++) {
            if (array[y].length > maxX) {
                maxX = array[y].length;
            }

            for (int x = 0; x < array[y].length; x++) {
                final int length = StringExtensions.removeANSICodes(formatter.apply(array[y][x], x, y)).length();
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        System.out.println(String.format("%1$sPrinting 2D array of size %2$s%3$s%5$dx%6$d%4$s%1$s.%2$s",
                ConsoleANSICode.DIM_ON, ConsoleANSICode.DIM_OFF, ConsoleANSICode.FG_YELLOW, ConsoleANSICode.COLOR_OFF,
                array[0].length, array.length));

        final int xDigits = (int) (Math.log10(maxX) + 1);
        final int yDigits = (int) (Math.log10(array.length) + 1);
        final int elementLength = maxLength > xDigits ? maxLength : xDigits;

        // Print x-axis
        String xAxis = String.format("%" + (yDigits + 1) + "s", "") + ConsoleANSICode.DIM_ON;
        for (int i = 0; i < maxX; i++) {
            xAxis += String.format("%" + elementLength + "d", i);
        }

        xAxis += ConsoleANSICode.DIM_OFF + "\n";

        String out = xAxis;
        for (int y = 0; y < array.length; y++) {
            out += String.format("%1$s%3$" + yDigits + "d %2$s", ConsoleANSICode.DIM_ON, ConsoleANSICode.DIM_OFF, y);

            for (int x = 0; x < array[y].length; x++) {
                final String formatted = formatter.apply(array[y][x], x, y);
                final String withoutANSIEscapeCodes = StringExtensions.removeANSICodes(formatted);
                out += String.format("%" + (elementLength + formatted.length() - withoutANSIEscapeCodes.length()) + "s", formatted);
            }

            out += "\n";
        }

        System.out.println(out);

    }

}
