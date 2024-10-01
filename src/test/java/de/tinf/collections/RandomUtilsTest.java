package de.tinf.collections;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RandomUtilsTest {

    @Test
    void testRandomIntFromZero(){
        int low = 0;
        int high = 10;
        int random = RandomUtils.getRandomIntFromZero(high);
        assertTrue(high >= random);
        assertTrue(low  <= random);
    }

    @Test
    void testRandomInt(){
        int low = 0;
        int high = 10;
        int random = RandomUtils.getRandomInteger(low, high);
        assertTrue(high >= random);
        assertTrue(low  <= random);
    }

    @Test
    void testRandomDoubleFromZero(){
        double low = 0;
        double high = 10;
        double random = RandomUtils.getRandomDoubleFromZero(high);
        assertTrue(high >= random);
        assertTrue(low  <= random);
    }

    @Test
    void testRandomDouble(){
        double low = 0;
        double high = 10;
        double random = RandomUtils.getRandomDouble(low, high);
        assertTrue(high >= random);
        assertTrue(low  <= random);
    }

    @Test
    void testRandomLongFromZero(){
        long low = 0;
        long high = 10;
        long random = RandomUtils.getRandomLongFromZero(high);
        assertTrue(high >= random);
        assertTrue(low  <= random);
    }

    @Test
    void testRandomLong(){
        long low = 0;
        long high = 10;
        long random = RandomUtils.getRandomLong(low, high);
        assertTrue(high >= random);
        assertTrue(low  <= random);
    }

    @Test
    void testRandomFloatFromZero(){
        float low = 0;
        float high = 10;
        float random = RandomUtils.getRandomFloatFromZero(high);
        assertTrue(high >= random);
        assertTrue(low  <= random);
    }

    @Test
    void testRandomFloat(){
        float low = 0;
        float high = 10;
        float random = RandomUtils.getRandomFloat(low, high);
        assertTrue(high >= random);
        assertTrue(low  <= random);
    }









}
