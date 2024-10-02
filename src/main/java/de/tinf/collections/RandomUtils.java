package de.tinf.collections;

import java.awt.Color;
import java.util.List;
import java.util.Random;

public class RandomUtils {

    public static Random RANDOM = new Random();

    /**
     * Generate a random Integer from 0 to a desired Number
     *
     * @param maxValue Upper bound of desired Number
     * @return Random integer from 0 to maxNumber inclusive.
     */
    public static int getRandomIntFromZero(int maxValue){
        // nextInt is exclusive of the top value, so add 1 to make it inclusive
        return RANDOM.nextInt(maxValue+1);
    }

    /**
     * Generate a random Integer from min to max
     *
     * @param minValue Lower bound of desired Number
     * @param maxValue Upper bound of desired Number
     * @return Random integer from min to max inclusive.
     */
    public static int getRandomInteger(int minValue, int maxValue){
        return RANDOM.nextInt((maxValue - minValue) + 1) + minValue;
    }

    /**
     * Gernerate a random double between 0 and maxValue.
     * In this case the maxValue is excluded.
     *
     * @param maxValue Max value of the random double.
     * @return Random double from 0 to maxValue.
     */
    public static double getRandomDoubleFromZero(double maxValue){
        return RANDOM.nextDouble(maxValue);
    }

    public static double getRandomDouble(double minValue, double maxValue){
        return RANDOM.nextDouble(minValue, maxValue);
    }

    /**
     * Generate a random long between 0 and maxValue.
     * In this case the maxValue is excluded.
     *
     * @param maxValue Max value of the random long.
     * @return Random long from 0 to maxValue.
     */
    public static long getRandomLongFromZero(long maxValue) {
        return RANDOM.nextLong(maxValue);
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
        return RANDOM.nextLong(minValue, maxValue);
    }

    /**
     * Generate a random float between 0 and maxValue (excluded).
     *
     * @param maxValue Max value of the random float.
     * @return Random float from
     */
    public static float getRandomFloatFromZero(float maxValue){
        return RANDOM.nextFloat(maxValue);
    }

    /**
     * Generate a random float between minValue and maxValue (excluded).
     *
     * @param minValue Min value of the random float.
     * @param maxValue Max value of the random float.
     * @return Random float from minValue to maxValue.
     */
    public static float getRandomFloat(float minValue, float maxValue) {
        return RANDOM.nextFloat(minValue, maxValue);
    }

    /**
     * Pick a random object from a list. You might have to cast to the right Datatype
     *
     * @param list The List of which an object is to be picked.
     * @return The picked object
     */
    public static Object pickRandomObjectFromList(List list){
        return list.get(RANDOM.nextInt(list.size()));
    }

    /**
     * Get a random Color
     * @return random Color
     */
    public static Color getRandomColor() {

        int red = RANDOM.nextInt(256);
        int green = RANDOM.nextInt(256);
        int blue = RANDOM.nextInt(256);


        return new Color(red, green, blue);
    }

}