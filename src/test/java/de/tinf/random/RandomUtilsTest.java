package de.tinf.random;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

public class RandomUtilsTest {

    @Test
    void testRandomIntFromZero() {
        int low = 0;
        int high = 10;
        int random = RandomUtils.getRandomInt(high);
        assertTrue(high >= random);
        assertTrue(low <= random);
    }

    @Test
    void testRandomInt() {
        int low = 0;
        int high = 10;
        int random = RandomUtils.getRandomInt(low, high);
        assertTrue(high >= random);
        assertTrue(low <= random);
    }

    @Test
    void testRandomDoubleFromZero() {
        double low = 0;
        double high = 10;
        double random = RandomUtils.getRandomDouble(high);
        assertTrue(high >= random);
        assertTrue(low <= random);
    }

    @Test
    void testRandomDouble() {
        double low = 0;
        double high = 10;
        double random = RandomUtils.getRandomDouble(low, high);
        assertTrue(high >= random);
        assertTrue(low <= random);
    }

    @Test
    void testRandomLongFromZero() {
        long low = 0;
        long high = 10;
        long random = RandomUtils.getRandomLong(high);
        assertTrue(high >= random);
        assertTrue(low <= random);
    }

    @Test
    void testRandomLong() {
        long low = 0;
        long high = 10;
        long random = RandomUtils.getRandomLong(low, high);
        assertTrue(high >= random);
        assertTrue(low <= random);
    }

    @Test
    void testRandomFloatFromZero() {
        float low = 0;
        float high = 10;
        float random = RandomUtils.getRandomFloat(high);
        assertTrue(high >= random);
        assertTrue(low <= random);
    }

    @Test
    void testRandomFloat() {
        float low = 0;
        float high = 10;
        float random = RandomUtils.getRandomFloat(low, high);
        assertTrue(high >= random);
        assertTrue(low <= random);
    }

    @Test
    void testRandomListPick() {
        ArrayList<String> list = new ArrayList();
        list.add("Hallo");
        list.add("Welt");
        list.add("DHBW");
        list.add("Stinkt");

        String randomObject = (String) RandomUtils.pickRandom(list);
        assertTrue(list.contains(randomObject));
    }

    @Test
    void testRandomColor() {

        int low = 0;
        int high = 255;

        Color color = RandomUtils.getRandomColor();
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        assertTrue(high >= r);
        assertTrue(low <= r);

        assertTrue(high >= g);
        assertTrue(low <= g);

        assertTrue(high >= b);
        assertTrue(low <= b);
    }

    @Test
    void testPickRandomEnum() {
        List<TestEnum> randomEnums = RandomUtils.pickRandom(TestEnum.class, 2);
        assertEquals(2, randomEnums.size());
        for (TestEnum randomEnum : randomEnums) {
            assertTrue(TestEnum.contains(randomEnum));
        }
    }

    @Test
    void testPickRandomEnumWithCountGreaterThanEnumSize() {
        List<TestEnum> randomEnums = RandomUtils.pickRandom(TestEnum.class, 10);
        assertEquals(TestEnum.values().length, randomEnums.size());
        for (TestEnum randomEnum : randomEnums) {
            assertTrue(TestEnum.contains(randomEnum));
        }
    }

    @Test
    void testPickRandomEnumSingle() {
        TestEnum randomEnum = RandomUtils.pickRandom(TestEnum.class);
        assertTrue(TestEnum.contains(randomEnum));
    }

    @Test
    void testPickRandomEnumMultiple() {
        List<TestEnum> randomEnums = RandomUtils.pickRandom(TestEnum.class, 2);
        assertEquals(2, randomEnums.size());
        for (TestEnum randomEnum : randomEnums) {
            assertTrue(TestEnum.contains(randomEnum));
        }
    }

    @Test
    void testPickRandomFromList() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        String randomElement = RandomUtils.pickRandom(list);
        assertTrue(list.contains(randomElement));
    }

    @Test
    void testPickRandomFromEmptyList() {
        List<String> list = new ArrayList<>();

        assertThrows(IllegalArgumentException.class, () -> RandomUtils.pickRandom(list));
    }

    @Test
    void testPickRandomMultipleFromList() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        int count = 3;
        List<String> randomElements = RandomUtils.pickRandom(list, count);
        assertEquals(count, randomElements.size());
        for (String element : randomElements) {
            assertTrue(list.contains(element));
        }
    }

    @Test
    void testPickRandomMultipleFromListWithCountGreaterThanListSize() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        int count = 5;
        List<String> randomElements = RandomUtils.pickRandom(list, count);
        assertEquals(list.size(), randomElements.size());
        for (String element : randomElements) {
            assertTrue(list.contains(element));
        }
    }

    @Test
    void testPickRandomMultipleFromEmptyList() {
        List<String> list = new ArrayList<>();

        int count = 3;
        List<String> randomElements = RandomUtils.pickRandom(list, count);
        assertTrue(randomElements.isEmpty());
    }

    @Test
    void testGetRandomColor() {
        Color color = RandomUtils.getRandomColor();
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        assertTrue(r >= 0 && r <= 255, "Red component out of range: " + r);
        assertTrue(g >= 0 && g <= 255, "Green component out of range: " + g);
        assertTrue(b >= 0 && b <= 255, "Blue component out of range: " + b);
    }

    @Test
    void testGetRandomColorWithMinMax() {
        int min = 50;
        int max = 200;

        Color color = RandomUtils.getRandomColor(min, max);
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        assertTrue(r >= min && r <= max, "Red component out of range: " + r);
        assertTrue(g >= min && g <= max, "Green component out of range: " + g);
        assertTrue(b >= min && b <= max, "Blue component out of range: " + b);
    }

    @Test
    void testGetRandomColorWithMinMaxEdgeCases() {
        int min = 0;
        int max = 255;

        Color color = RandomUtils.getRandomColor(min, max);
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        assertTrue(r >= min && r <= max, "Red component out of range: " + r);
        assertTrue(g >= min && g <= max, "Green component out of range: " + g);
        assertTrue(b >= min && b <= max, "Blue component out of range: " + b);
    }

    @Test
    void testGetRandomColorWithInvalidRange() {
        int min = 200;
        int max = 50;

        assertThrows(IllegalArgumentException.class, () -> RandomUtils.getRandomColor(min, max));
    }

    @Test
    void testGetRandomColorWithSpecificRanges() {
        int rMin = 10;
        int rMax = 100;
        int gMin = 20;
        int gMax = 150;
        int bMin = 30;
        int bMax = 200;

        Color color = RandomUtils.getRandomColor(rMin, rMax, gMin, gMax, bMin, bMax);
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        assertTrue(r >= rMin && r <= rMax, "Red component out of range: " + r);
        assertTrue(g >= gMin && g <= gMax, "Green component out of range: " + g);
        assertTrue(b >= bMin && b <= bMax, "Blue component out of range: " + b);
    }

    @Test
    void testGetRandomColorWithEdgeCases() {
        int rMin = 0;
        int rMax = 255;
        int gMin = 0;
        int gMax = 255;
        int bMin = 0;
        int bMax = 255;

        Color color = RandomUtils.getRandomColor(rMin, rMax, gMin, gMax, bMin, bMax);
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        assertTrue(r >= rMin && r <= rMax, "Red component out of range: " + r);
        assertTrue(g >= gMin && g <= gMax, "Green component out of range: " + g);
        assertTrue(b >= bMin && b <= bMax, "Blue component out of range: " + b);
    }

    @Test
    void testGetRandomColorWithInvalidRanges() {
        int rMin = 100;
        int rMax = 50;
        int gMin = 150;
        int gMax = 100;
        int bMin = 200;
        int bMax = 150;

        assertThrows(IllegalArgumentException.class, () -> RandomUtils.getRandomColor(rMin, rMax, gMin, gMax, bMin, bMax));
    }

    @Test
    void testGetRandomColorWithMaxValues() {
        int rMax = 100;
        int gMax = 150;
        int bMax = 200;

        Color color = RandomUtils.getRandomColor(rMax, gMax, bMax);
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        assertTrue(r >= 0 && r <= rMax, "Red component out of range: " + r);
        assertTrue(g >= 0 && g <= gMax, "Green component out of range: " + g);
        assertTrue(b >= 0 && b <= bMax, "Blue component out of range: " + b);
    }

    @Test
    void testGetRandomColorWithMaxValuesEdgeCases() {
        int rMax = 255;
        int gMax = 255;
        int bMax = 255;

        Color color = RandomUtils.getRandomColor(rMax, gMax, bMax);
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        assertTrue(r >= 0 && r <= rMax, "Red component out of range: " + r);
        assertTrue(g >= 0 && g <= gMax, "Green component out of range: " + g);
        assertTrue(b >= 0 && b <= bMax, "Blue component out of range: " + b);
    }

    @Test
    void testGetRandomColorWithMaxValuesZero() {
        int rMax = 0;
        int gMax = 0;
        int bMax = 0;

        Color color = RandomUtils.getRandomColor(rMax, gMax, bMax);
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        assertEquals(0, r, "Red component should be 0");
        assertEquals(0, g, "Green component should be 0");
        assertEquals(0, b, "Blue component should be 0");
    }

    private enum TestEnum {
        VALUE1, VALUE2, VALUE3;

        public static boolean contains(TestEnum value) {
            for (TestEnum enumValue : TestEnum.values()) {
                if (enumValue == value) {
                    return true;
                }
            }
            return false;
        }
    }
}
