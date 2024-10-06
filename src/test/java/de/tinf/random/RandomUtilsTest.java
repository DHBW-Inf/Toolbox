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
