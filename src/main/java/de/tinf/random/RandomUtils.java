package de.tinf.random;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomUtils {

    private static final Random RANDOM = new Random();

    /**
     * Returns a singleton instance of the Random class.
     *
     * @return a Random instance
     */
    public static Random getRandomInstance() {
        return RANDOM;
    }

    /**
     * Generates a random integer between 0 (inclusive) and the specified maxValue
     * (inclusive).
     *
     * @param maxValue the maximum value (inclusive) for the random integer
     * @return a random integer between 0 and maxValue (inclusive)
     */
    public static int getRandomInt(int maxValue) {
        // nextInt is exclusive of the top value, so add 1 to make it inclusive
        return RANDOM.nextInt(maxValue + 1);
    }

    /**
     * Generates a random integer within the specified range.
     *
     * @param minValue the minimum value of the range (inclusive)
     * @param maxValue the maximum value of the range (inclusive)
     * @return a random integer between minValue (inclusive) and maxValue
     *         (inclusive)
     */
    public static int getRandomInt(int minValue, int maxValue) {
        return RANDOM.nextInt((maxValue - minValue) + 1) + minValue;
    }

    /**
     * Generates a random double value between 0 and the specified maximum value.
     *
     * @param maxValue the upper bound for the random double value
     * @return a random double value between 0 and maxValue
     */
    public static double getRandomDouble(double maxValue) {
        return RANDOM.nextDouble(maxValue);
    }

    /**
     * Generates a random double value within the specified range.
     *
     * @param minValue the minimum value of the range
     * @param maxValue the maximum value of the range
     * @return a random double value between minValue and maxValue
     */
    public static double getRandomDouble(double minValue, double maxValue) {
        return RANDOM.nextDouble(minValue, maxValue);
    }

    /**
     * Generates a random long value between 0 (inclusive) and the specified maximum
     * value (inclusive).
     *
     * @param maxValue the maximum value (inclusive) for the generated random long.
     * @return a random long value between 0 (inclusive) and maxValue (inclusive).
     */
    public static long getRandomLong(long maxValue) {
        return RANDOM.nextLong(maxValue + 1);
    }

    /**
     * Generates a random long value between the specified minimum (inclusive) and
     * maximum (inclusive) values.
     *
     * @param minValue the minimum value (inclusive)
     * @param maxValue the maximum value (inclusive)
     * @return a random long value between minValue (inclusive) and maxValue
     *         (inclusive)
     */
    public static long getRandomLong(long minValue, long maxValue) {
        return RANDOM.nextLong(minValue, maxValue + 1);
    }

    /**
     * Generates a random float value between 0 and the specified maxValue.
     *
     * @param maxValue the upper bound for the random float value
     * @return a random float value between 0 and maxValue
     */
    public static float getRandomFloat(float maxValue) {
        return RANDOM.nextFloat(maxValue);
    }

    /**
     * Generates a random float value between the specified minimum and maximum
     * values.
     *
     * @param minValue the minimum value
     * @param maxValue the maximum value
     * @return a random float value between minValue and maxValue
     */
    public static float getRandomFloat(float minValue, float maxValue) {
        return RANDOM.nextFloat(minValue, maxValue);
    }

    /**
     * Selects a random element from the provided list.
     *
     * @param <T>  the type of elements in the list
     * @param list the list from which to pick a random element
     * @return a randomly selected element from the list
     * @throws IllegalArgumentException if the list is empty
     */
    public static <T> T pickRandom(List<T> list) {
        return list.get(RANDOM.nextInt(list.size()));
    }

    /**
     * Selects a number random element from the provided list.
     *
     * @param <T>   the type of elements in the list
     * @param list  the list from which to pick the random elements
     * @param count the number of elements to select
     * @return a list containing the randomly selected items
     */
    public static <T> List<T> pickRandom(List<T> list, int count) {
        List<T> copy = new ArrayList<T>(list);
        List<T> result = new ArrayList<T>();

        for (int i = 0; i < count && !copy.isEmpty(); i++) {
            result.add(copy.remove(RANDOM.nextInt(copy.size())));
        }

        return result;
    }

    /**
     * Picks a random constant from the specified enum class.
     *
     * @param <T>       the type of the enum
     * @param enumClass the class of the enum from which to pick a random constant
     * @return a randomly selected constant from the specified enum class
     */
    public static <T extends Enum<T>> T pickRandom(Class<T> enumClass) {
        return pickRandom(Arrays.asList(enumClass.getEnumConstants()));
    }

    /**
     * Picks a specified number of random elements from the given enum class.
     *
     * @param <T>       the type of the enum
     * @param enumClass the class of the enum from which to pick random elements
     * @param count     the number of random elements to pick
     * @return a list of randomly picked elements from the enum
     */
    public static <T extends Enum<T>> List<T> pickRandom(Class<T> enumClass, int count) {
        return pickRandom(Arrays.asList(enumClass.getEnumConstants()), count);
    }


    /**
     * Generates a random color.
     * 
     * @return A random {@link Color} object.
     */
    public static Color getRandomColor() {
        return getRandomColor(255);
    }

    /**
     * Generates a random color with each RGB component constrained between the specified minimum and maximum values.
     *
     * @param min the minimum value for each RGB component (inclusive)
     * @param max the maximum value for each RGB component (inclusive)
     * @return a random {@link Color} object with RGB values within the specified range
     */
    public static Color getRandomColor(int min, int max) {
        return getRandomColor(min, max, min, max, min, max);
    }

    /**
     * Generates a random color with the specified maximum RGB values.
     *
     * @param max the maximum (inclusive) value for the red, green, and blue components of the color.
     * @return a random {@link Color} object with RGB values up to the specified maximum.
     */
    public static Color getRandomColor(int max) {
        return getRandomColor(max, max, max);
    }

    /**
     * Generates a random color with RGB values within the specified ranges.
     *
     * @param rMin the minimum value for the red component (inclusive)
     * @param rMax the maximum value for the red component (inclusive)
     * @param gMin the minimum value for the green component (inclusive)
     * @param gMax the maximum value for the green component (inclusive)
     * @param bMin the minimum value for the blue component (inclusive)
     * @param bMax the maximum value for the blue component (inclusive)
     * @return a Color object with random RGB values within the specified ranges
     */
    public static Color getRandomColor(int rMin, int rMax, int gMin, int gMax, int bMin, int bMax) {
        return new Color(getRandomInt(rMin, rMax), getRandomInt(gMin, gMax), getRandomInt(bMin, bMax));
    }

    /**
     * Generates a random color with the specified maximum values for the red, green, and blue components.
     *
     * @param rMax the maximum value for the red component (0 to 255)
     * @param gMax the maximum value for the green component (0 to 255)
     * @param bMax the maximum value for the blue component (0 to 255)
     * @return a random {@link Color} object with the specified maximum RGB values
     */
    public static Color getRandomColor(int rMax, int gMax, int bMax) {
        return getRandomColor(0, rMax, 0, gMax, 0, bMax);
    }

}