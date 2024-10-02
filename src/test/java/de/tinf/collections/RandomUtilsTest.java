package de.tinf.collections;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
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

    @Test
    void testRandomListPick(){
        ArrayList<String> list = new ArrayList();
        list.add("Hallo");
        list.add("Welt");
        list.add("DHBW");
        list.add("Stinkt");

        String randomObject = (String) RandomUtils.pickRandomObjectFromList(list);
        assertTrue(list.contains(randomObject));
    }

    @Test
    void testRandomColor(){

        int low = 0;
        int high = 255;

        Color color = RandomUtils.getRandomColor();
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        assertTrue(high >= r);
        assertTrue(low  <= r);

        assertTrue(high >= g);
        assertTrue(low  <= g);

        assertTrue(high >= b);
        assertTrue(low  <= b);
    }









}
