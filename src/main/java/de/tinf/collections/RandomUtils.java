package de.tinf.collections;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUtils {

    /**
     * Generate a random Integer from 0 to a desired Number
     *
     * @param maxValue Upper bound of desired Number
     * @return Random integer from 0 to maxNumber inclusive.
     */
    public static int getRandomIntFromZero(int maxValue){
        Random random = new Random();
        // nextInt is exclusive of the top value, so add 1 to make it inclusive
        return random.nextInt(maxValue+1);
    }

    /**
     * Generate a random Integer from min to max
     *
     * @param minValue Lower bound of desired Number
     * @param maxValue Upper bound of desired Number
     * @return Random integer from min to max inclusive.
     */
    public static int getRandomInteger(int minValue, int maxValue){
        Random random = new Random();
        return random.nextInt((maxValue - minValue) + 1) + minValue;
    }

    /**
     * Gernerate a random double between 0 and maxValue.
     * In this case the maxValue is excluded.
     *
     * @param maxValue Max value of the random double.
     * @return Random double from 0 to maxValue.
     */
    public static double getRandomDoubleFromZero(double maxValue){
        Random random = new Random();
        return random.nextDouble(maxValue);
    }

    public static double getRandomDouble(double minValue, double maxValue){
        Random random = new Random();
        return random.nextDouble(minValue, maxValue);
    }

    /**
     * Generate a random long between 0 and maxValue.
     * In this case the maxValue is excluded.
     *
     * @param maxValue Max value of the random long.
     * @return Random long from 0 to maxValue.
     */
    public static long getRandomLongFromZero(long maxValue) {
        Random random = new Random();
        return random.nextLong(maxValue);
    }


    /**
     *  Generate a random long between minValue and maxValue.
     *  In this case the minValue is included, while the maxValue is excluded.
     *
     * @param minValue Min value of the random long.
     * @param maxValue Max value of the random long.
     * @return Random long from minValue to maxValue.
     */
    public static long getRandomLong(long minValue, long maxValue) {
        Random random = new Random();
        return random.nextLong(minValue, maxValue);
    }

    /**
     * Generate a random float between 0 and maxValue (excluded).
     *
     * @param maxValue Max value of the random float.
     * @return Random float from
     */
    public static float getRandomFloatFromZero(float maxValue){
        Random random = new Random();
        return random.nextFloat(maxValue);
    }

    /**
     * Generate a random float between minValue and maxValue (excluded).
     *
     * @param minValue Min value of the random float.
     * @param maxValue Max value of the random float.
     * @return Random float from minValue to maxValue.
     */
    public static float getRandomFloat(float minValue, float maxValue) {
        Random random = new Random();
        return random.nextFloat(minValue, maxValue);
    }

    /**
     * Pick a random object from a list.
     *
     * @param list The List of which an object is to be picked.
     * @return The picked object
     */
    public static Object pickRandomObjectFromList(List list){
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    /**
     * Pick a random object from an ArrayList.
     *
     * @param list The ArrayList of which an object is to be picked.
     * @return The picked object
     */
    public static Object pickRandomObjectFromArrayList(ArrayList list){
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }


    /**
     * Get a random Color
     * @return random Color
     */
    private Color getRandomColor() {

        Random random = new Random();

        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);


        return new Color(red, green, blue);
    }

}