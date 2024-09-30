package de.tinf.io;

import java.util.Arrays;
import java.util.Scanner;

import de.tinf.collections.ArrayUtils;
import de.tinf.typeExtension.StringExtensions;

public class ConsoleUtils {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Print an array to the system standard out. {@code .toString()} is called on
     * each element.
     *
     * @param array the array to print.
     */
    public static void printArray(byte[] array) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), (element, index) -> element.toString() + " ");
    }

    /**
     * Print an array to the system standard out. {@code .toString()} is called on
     * each element.
     *
     * @param array the array to print.
     */
    public static void printArray(short[] array) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), (element, index) -> element.toString() + " ");
    }

    /**
     * Print an array to the system standard out. {@code .toString()} is called on
     * each element.
     *
     * @param array the array to print.
     */
    public static void printArray(int[] array) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), (element, index) -> element.toString() + " ");
    }

    /**
     * Print an array to the system standard out. {@code .toString()} is called on
     * each element.
     *
     * @param array the array to print.
     */
    public static void printArray(long[] array) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), (element, index) -> element.toString() + " ");
    }

    /**
     * Print an array to the system standard out. {@code .toString()} is called on
     * each element.
     *
     * @param array the array to print.
     */
    public static void printArray(float[] array) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), (element, index) -> element.toString() + " ");
    }

    /**
     * Print an array to the system standard out. {@code .toString()} is called on
     * each element.
     *
     * @param array the array to print.
     */
    public static void printArray(double[] array) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), (element, index) -> element.toString() + " ");
    }

    /**
     * Print an array to the system standard out. {@code .toString()} is called on
     * each element.
     *
     * @param array the array to print.
     */
    public static void printArray(char[] array) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), (element, index) -> element.toString() + " ");
    }

    /**
     * Print an array to the system standard out. {@code .toString()} is called on
     * each element.
     *
     * @param array the array to print.
     */
    public static void printArray(boolean[] array) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), (element, index) -> element.toString() + " ");
    }

    /**
     * Print an array to the system standard out. {@code .toString()} is called on
     * each element.
     *
     * @param <T>   the type of the array to print.
     * @param array the array to print.
     */
    public static <T> void printArray(T[] array) {
        ConsoleUtils.printArray(array, (element, index) -> element.toString() + " ");
    }

    /**
     * Print an array to the system standard out.
     *
     * <pre>
     * {@code
     * ConsoleUtils.printArray(array, (element, index) -> {
     *     return element + " at " + index;
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void printArray(byte[] array, ArrayFormattable<Byte> formatter) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), formatter);
    }

    /**
     * Print an array to the system standard out.
     *
     * <pre>
     * {@code
     * ConsoleUtils.printArray(array, (element, index) -> {
     *     return element + " at " + index;
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void printArray(short[] array, ArrayFormattable<Short> formatter) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), formatter);
    }

    /**
     * Print an array to the system standard out.
     *
     * <pre>
     * {@code
     * ConsoleUtils.printArray(array, (element, index) -> {
     *     return element + " at " + index;
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void printArray(int[] array, ArrayFormattable<Integer> formatter) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), formatter);
    }

    /**
     * Print an array to the system standard out.
     *
     * <pre>
     * {@code
     * ConsoleUtils.printArray(array, (element, index) -> {
     *     return element + " at " + index;
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void printArray(long[] array, ArrayFormattable<Long> formatter) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), formatter);
    }

    /**
     * Print an array to the system standard out.
     *
     * <pre>
     * {@code
     * ConsoleUtils.printArray(array, (element, index) -> {
     *     return element + " at " + index;
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void printArray(float[] array, ArrayFormattable<Float> formatter) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), formatter);
    }

    /**
     * Print an array to the system standard out.
     *
     * <pre>
     * {@code
     * ConsoleUtils.printArray(array, (element, index) -> {
     *     return element + " at " + index;
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void printArray(double[] array, ArrayFormattable<Double> formatter) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), formatter);
    }

    /**
     * Print an array to the system standard out.
     *
     * <pre>
     * {@code
     * ConsoleUtils.printArray(array, (element, index) -> {
     *     return element + " at " + index;
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void printArray(char[] array, ArrayFormattable<Character> formatter) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), formatter);
    }

    /**
     * Print an array to the system standard out.
     *
     * <pre>
     * {@code
     * ConsoleUtils.printArray(array, (element, index) -> {
     *     return element + " at " + index;
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void printArray(boolean[] array, ArrayFormattable<Boolean> formatter) {
        ConsoleUtils.printArray(ArrayUtils.toObjectArray(array), formatter);
    }

    /**
     * Print an array to the system standard out.
     *
     * <pre>
     * {@code
     * ConsoleUtils.printArray(array, (element, index) -> {
     *     return element + " at " + index;
     * });
     * }
     * </pre>
     *
     * @param <T>       the type of the array to print.
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static <T> void printArray(T[] array, ArrayFormattable<T> formatter) {
        System.out
                .printf("%1$sPrinting array of length %2$s%3$s%5$d%4$s%1$s.%2$s%n", ConsoleANSICode.DIM_ON,
                        ConsoleANSICode.DIM_OFF, ConsoleANSICode.FG_YELLOW, ConsoleANSICode.COLOR_OFF, (Object) array.length);
        if (array.length == 0) {
            return;
        }

        final int lengthDigits = (int) (Math.log10(array.length) + 1);
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            output.append(String.format("%1$s%3$" + lengthDigits + "d %2$s%4$s\n", ConsoleANSICode.DIM_ON,
                    ConsoleANSICode.DIM_OFF, (Object) i, formatter.format(array[i], i)));
        }

        System.out.println(output);
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. {@code .toString()} is called
     * on each element. If the passed array is empty nothing gets printed.
     *
     * @param array the array to print.
     */
    public static void print2DArray(byte[][] array) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Byte[][]::new));
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. {@code .toString()} is called
     * on each element. If the passed array is empty nothing gets printed.
     *
     * @param array the array to print.
     */
    public static void print2DArray(short[][] array) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Short[][]::new));
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. {@code .toString()} is called
     * on each element. If the passed array is empty nothing gets printed.
     *
     * @param array the array to print.
     */
    public static void print2DArray(int[][] array) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Integer[][]::new));
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. {@code .toString()} is called
     * on each element. If the passed array is empty nothing gets printed.
     *
     * @param array the array to print.
     */
    public static void print2DArray(long[][] array) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Long[][]::new));
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. {@code .toString()} is called
     * on each element. If the passed array is empty nothing gets printed.
     *
     * @param array the array to print.
     */
    public static void print2DArray(float[][] array) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Float[][]::new));
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. {@code .toString()} is called
     * on each element. If the passed array is empty nothing gets printed.
     *
     * @param array the array to print.
     */
    public static void print2DArray(double[][] array) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Double[][]::new));
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. {@code .toString()} is called
     * on each element. If the passed array is empty nothing gets printed.
     *
     * @param array the array to print.
     */
    public static void print2DArray(char[][] array) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Character[][]::new));
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. {@code .toString()} is called
     * on each element. If the passed array is empty nothing gets printed.
     *
     * @param array the array to print.
     */
    public static void print2DArray(boolean[][] array) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Boolean[][]::new));
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. {@code .toString()} is called
     * on each element. If the passed array is empty nothing gets printed.
     *
     * @param <T>   the type of the array to print.
     * @param array the array to print.
     */
    public static <T> void print2DArray(T[][] array) {
        ConsoleUtils.print2DArray(array, (element, x, y) -> " " + element.toString());
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. If the passed array is empty
     * nothing gets printed.
     *
     * <pre>
     * {@code
     * ConsoleUtils.print2DArray(array, (element, x, y) -> {
     *     if (y % 2 == 0) {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_BLUE);
     *     } else {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_CYAN);
     *     }
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void print2DArray(byte[][] array, Array2DFormattable<Byte> formatter) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Byte[][]::new), formatter);
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. If the passed array is empty
     * nothing gets printed.
     *
     * <pre>
     * {@code
     * ConsoleUtils.print2DArray(array, (element, x, y) -> {
     *     if (y % 2 == 0) {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_BLUE);
     *     } else {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_CYAN);
     *     }
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void print2DArray(short[][] array, Array2DFormattable<Short> formatter) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Short[][]::new), formatter);
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. If the passed array is empty
     * nothing gets printed.
     *
     * <pre>
     * {@code
     * ConsoleUtils.print2DArray(array, (element, x, y) -> {
     *     if (y % 2 == 0) {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_BLUE);
     *     } else {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_CYAN);
     *     }
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void print2DArray(int[][] array, Array2DFormattable<Integer> formatter) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Integer[][]::new), formatter);
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. If the passed array is empty
     * nothing gets printed.
     *
     * <pre>
     * {@code
     * ConsoleUtils.print2DArray(array, (element, x, y) -> {
     *     if (y % 2 == 0) {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_BLUE);
     *     } else {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_CYAN);
     *     }
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void print2DArray(long[][] array, Array2DFormattable<Long> formatter) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Long[][]::new), formatter);
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. If the passed array is empty
     * nothing gets printed.
     *
     * <pre>
     * {@code
     * ConsoleUtils.print2DArray(array, (element, x, y) -> {
     *     if (y % 2 == 0) {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_BLUE);
     *     } else {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_CYAN);
     *     }
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void print2DArray(float[][] array, Array2DFormattable<Float> formatter) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Float[][]::new), formatter);
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. If the passed array is empty
     * nothing gets printed.
     *
     * <pre>
     * {@code
     * ConsoleUtils.print2DArray(array, (element, x, y) -> {
     *     if (y % 2 == 0) {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_BLUE);
     *     } else {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_CYAN);
     *     }
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void print2DArray(double[][] array, Array2DFormattable<Double> formatter) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Double[][]::new), formatter);
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. If the passed array is empty
     * nothing gets printed.
     *
     * <pre>
     * {@code
     * ConsoleUtils.print2DArray(array, (element, x, y) -> {
     *     if (y % 2 == 0) {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_BLUE);
     *     } else {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_CYAN);
     *     }
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void print2DArray(char[][] array, Array2DFormattable<Character> formatter) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Character[][]::new), formatter);
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. If the passed array is empty
     * nothing gets printed.
     *
     * <pre>
     * {@code
     * ConsoleUtils.print2DArray(array, (element, x, y) -> {
     *     if (y % 2 == 0) {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_BLUE);
     *     } else {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_CYAN);
     *     }
     * });
     * }
     * </pre>
     *
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static void print2DArray(boolean[][] array, Array2DFormattable<Boolean> formatter) {
        print2DArray(Arrays.stream(array).map(ArrayUtils::toObjectArray).toArray(Boolean[][]::new), formatter);
    }

    /**
     * Print a 2D array to the system standard out. The outer array is used as
     * y-axis and the inner array is used as x-axis. If the passed array is empty
     * nothing gets printed.
     *
     * <pre>
     * {@code
     * ConsoleUtils.print2DArray(array, (element, x, y) -> {
     *     if (y % 2 == 0) {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_BLUE);
     *     } else {
     *         return " " + ConsoleANSICode.paint(element.toString(), ConsoleANSICode.BG_CYAN);
     *     }
     * });
     * }
     * </pre>
     *
     * @param <T>       the type of the array to print.
     * @param array     the array to print.
     * @param formatter the formatter used to format each element when printing.
     */
    public static <T> void print2DArray(T[][] array, Array2DFormattable<T> formatter) {
        if (array.length == 0 || array[0].length == 0) {
            return;
        }

        int maxLength = 0;
        int maxX = 0;
        for (int y = 0; y < array.length; y++) {
            if (array[y].length > maxX) {
                maxX = array[y].length;
            }

            for (int x = 0; x < array[y].length; x++) {
                final int length = StringExtensions.removeANSICodes(formatter.format(array[y][x], x, y)).length();
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        System.out.printf("%1$sPrinting 2D array of size %2$s%3$s%5$dx%6$d%4$s%1$s.%2$s%n",
                ConsoleANSICode.DIM_ON, ConsoleANSICode.DIM_OFF, ConsoleANSICode.FG_YELLOW, ConsoleANSICode.COLOR_OFF,
                (Object) array[0].length, (Object) array.length);

        final int xDigits = (int) (Math.log10(maxX) + 1);
        final int yDigits = (int) (Math.log10(array.length) + 1);
        final int elementLength = Math.max(maxLength, xDigits);

        // Print x-axis
        StringBuilder xAxis = new StringBuilder(String.format("%" + (yDigits + 1) + "s", "") + ConsoleANSICode.DIM_ON);
        for (int i = 0; i < maxX; i++) {
            xAxis.append(String.format("%" + elementLength + "d", (Object) i));
        }

        xAxis.append(ConsoleANSICode.DIM_OFF + "\n");

        StringBuilder out = new StringBuilder(xAxis.toString());
        for (int y = 0; y < array.length; y++) {
            out.append(String.format("%1$s%3$" + yDigits + "d %2$s", ConsoleANSICode.DIM_ON, ConsoleANSICode.DIM_OFF, (Object) y));

            for (int x = 0; x < array[y].length; x++) {
                final String formatted = formatter.format(array[y][x], x, y);
                final String withoutANSIEscapeCodes = StringExtensions.removeANSICodes(formatted);
                out.append(String.format("%" + (elementLength + formatted.length() - withoutANSIEscapeCodes.length()) + "s",
                        formatted));
            }

            out.append("\n");
        }

        System.out.println(out);

    }

    /**
     * Returns the global scanner object used for reading input from the console.
     *
     * @return the scanner object.
     */
    public static Scanner getScanner() {
        return scanner;
    }

    /**
     * A functional interface for formatting elements of an array.
     *
     * @param <T> the type of elements in the array.
     */
    @FunctionalInterface
    public interface ArrayFormattable<T> {
        /**
         * Formats the specified element at the given index.
         *
         * @param element the element to format
         * @param index   the index of the element in the array
         * @return the formatted string representation of the element
         */
        String format(T element, int index);
    }

    /**
     * A functional interface for formatting elements in a 2D array.
     *
     * @param <T> the type of elements in the array.
     */
    @FunctionalInterface
    public interface Array2DFormattable<T> {
        /**
         * Formats the specified element at the given coordinates.
         *
         * @param element the element to format.
         * @param x       the x-coordinate of the element.
         * @param y       the y-coordinate of the element.
         * @return the formatted string representation of the element.
         */
        String format(T element, int x, int y);
    }
}
