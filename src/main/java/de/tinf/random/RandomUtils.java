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
     * Generates a random integer between 0 (inclusive) and the specified maxValue (inclusive).
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
     * @return a random integer between minValue (inclusive) and maxValue (inclusive)
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
     * Generates a random long value between 0 (inclusive) and the specified maximum value (inclusive).
     *
     * @param maxValue the maximum value (inclusive) for the generated random long.
     * @return a random long value between 0 (inclusive) and maxValue (inclusive).
     */
    public static long getRandomLong(long maxValue) {
        return RANDOM.nextLong(maxValue + 1);
    }

    /**
     * Generates a random long value between the specified minimum (inclusive) and maximum (inclusive) values.
     *
     * @param minValue the minimum value (inclusive)
     * @param maxValue the maximum value (inclusive)
     * @return a random long value between minValue (inclusive) and maxValue (inclusive)
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
     * Generates a random float value between the specified minimum and maximum values.
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
     * @param <T> the type of elements in the list
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
     * @param <T> the type of elements in the list
     * @param list the list from which to pick the random elements
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
     * @param <T> the type of the enum
     * @param enumClass the class of the enum from which to pick a random constant
     * @return a randomly selected constant from the specified enum class
     */
    public static <T extends Enum<T>> T pickRandom(Class<T> enumClass) {
        return pickRandom(Arrays.asList(enumClass.getEnumConstants()));
    }

    /**
     * Picks a specified number of random elements from the given enum class.
     *
     * @param <T> the type of the enum
     * @param enumClass the class of the enum from which to pick random elements
     * @param count the number of random elements to pick
     * @return a list of randomly picked elements from the enum
     */
    public static <T extends Enum<T>> List<T> pickRandom(Class<T> enumClass, int count) {
        return pickRandom(Arrays.asList(enumClass.getEnumConstants()), count);
    }

    /**
     * Get a random Color
     * 
     * @return random Color
     */
    public static Color getRandomColor() {

        int red = RANDOM.nextInt(256);
        int green = RANDOM.nextInt(256);
        int blue = RANDOM.nextInt(256);

        return new Color(red, green, blue);
    }

}