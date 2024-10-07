package de.tinf.collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {
    @Test
    void testAppend() {
        Integer[] array = { 1, 2, 3 };
        Integer[] expected = { 1, 2, 3, 4 };
        Integer[] result = ArrayUtils.append(array, 4);
        assertArrayEquals(expected, result);
    }

    @Test
    void testInsert() {
        Integer[] array = { 1, 2, 3 };
        Integer[] expected = { 1, 2, 4, 3 };
        Integer[] result = ArrayUtils.insert(array, 4, 2);
        assertArrayEquals(expected, result);

        assertThrowsExactly(IndexOutOfBoundsException.class, () -> ArrayUtils.insert(array, 4, 4),
                "Should throw an IndexOutOfBoundsException.");
    }

    @Test
    void testRemove() {
        Integer[] array = { 1, 2, 3 };
        Integer[] expected = { 1, 3 };
        Integer[] result = ArrayUtils.remove(array, 1);
        assertArrayEquals(expected, result);

        assertThrowsExactly(IndexOutOfBoundsException.class, () -> ArrayUtils.remove(array, 3),
                "Should throw an IndexOutOfBoundsException.");
    }

    @Test
    void testConcatenate() {
        Integer[] array1 = { 1, 2, 3 };
        Integer[] array2 = { 4, 5, 6 };
        Integer[] expected = { 1, 2, 3, 4, 5, 6 };
        Integer[] result = ArrayUtils.concatenate(array1, array2);
        assertArrayEquals(expected, result);

        array2 = new Integer[0];
        expected = array1;
        result = ArrayUtils.concatenate(array1, array2);
        assertArrayEquals(expected, result);
    }

    @Test
    void testReverse() {
        Integer[] array = { 1, 2, 3 };
        Integer[] expected = { 3, 2, 1 };
        Integer[] result = ArrayUtils.reverse(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToPrimitiveArrayByte() {
        Byte[] array = { 1, 2, 3 };
        byte[] expected = { 1, 2, 3 };
        byte[] result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);

        array = new Byte[0];
        expected = new byte[0];
        result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToPrimitiveArrayShort() {
        Short[] array = { 1, 2, 3 };
        short[] expected = { 1, 2, 3 };
        short[] result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);

        array = new Short[0];
        expected = new short[0];
        result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToPrimitiveArrayInteger() {
        Integer[] array = { 1, 2, 3 };
        int[] expected = { 1, 2, 3 };
        int[] result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);

        array = new Integer[0];
        expected = new int[0];
        result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToPrimitiveArrayLong() {
        Long[] array = { 1L, 2L, 3L };
        long[] expected = { 1L, 2L, 3L };
        long[] result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);

        array = new Long[0];
        expected = new long[0];
        result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToPrimitiveArrayFloat() {
        Float[] array = { 1.1f, 2.2f, 3.3f };
        float[] expected = { 1.1f, 2.2f, 3.3f };
        float[] result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result, 0.0001f);

        array = new Float[0];
        expected = new float[0];
        result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToPrimitiveArrayDouble() {
        Double[] array = { 1.1, 2.2, 3.3 };
        double[] expected = { 1.1, 2.2, 3.3 };
        double[] result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result, 0.0001);

        array = new Double[0];
        expected = new double[0];
        result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToPrimitiveArrayCharacter() {
        Character[] array = { 'a', 'b', 'c' };
        char[] expected = { 'a', 'b', 'c' };
        char[] result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);

        array = new Character[0];
        expected = new char[0];
        result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToPrimitiveArrayBoolean() {
        Boolean[] array = { true, false, true };
        boolean[] expected = { true, false, true };
        boolean[] result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);

        array = new Boolean[0];
        expected = new boolean[0];
        result = ArrayUtils.toPrimitiveArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToObjectArrayByte() {
        byte[] array = { 1, 2, 3 };
        Byte[] expected = { 1, 2, 3 };
        Byte[] result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);

        array = new byte[0];
        expected = new Byte[0];
        result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToObjectArrayShort() {
        short[] array = { 1, 2, 3 };
        Short[] expected = { 1, 2, 3 };
        Short[] result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);

        array = new short[0];
        expected = new Short[0];
        result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToObjectArrayInteger() {
        int[] array = { 1, 2, 3 };
        Integer[] expected = { 1, 2, 3 };
        Integer[] result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);

        array = new int[0];
        expected = new Integer[0];
        result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToObjectArrayLong() {
        long[] array = { 1L, 2L, 3L };
        Long[] expected = { 1L, 2L, 3L };
        Long[] result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);

        array = new long[0];
        expected = new Long[0];
        result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToObjectArrayFloat() {
        float[] array = { 1.1f, 2.2f, 3.3f };
        Float[] expected = { 1.1f, 2.2f, 3.3f };
        Float[] result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);

        array = new float[0];
        expected = new Float[0];
        result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToObjectArrayDouble() {
        double[] array = { 1.1, 2.2, 3.3 };
        Double[] expected = { 1.1, 2.2, 3.3 };
        Double[] result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);

        array = new double[0];
        expected = new Double[0];
        result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToObjectArrayCharacter() {
        char[] array = { 'a', 'b', 'c' };
        Character[] expected = { 'a', 'b', 'c' };
        Character[] result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);

        array = new char[0];
        expected = new Character[0];
        result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testToObjectArrayBoolean() {
        boolean[] array = { true, false, true };
        Boolean[] expected = { true, false, true };
        Boolean[] result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);

        array = new boolean[0];
        expected = new Boolean[0];
        result = ArrayUtils.toObjectArray(array);
        assertArrayEquals(expected, result);
    }

    @Test
    void testContains() {
        Integer[] array = { 1, 2, 3 };
        boolean result = ArrayUtils.contains(array, 2);
        assertTrue(result);

        result = ArrayUtils.contains(array, 4);
        assertFalse(result);

        String[] stringArray = { "a", "b", "c" };
        result = ArrayUtils.contains(stringArray, "b");
        assertTrue(result);

        result = ArrayUtils.contains(stringArray, "d");
        assertFalse(result);

        Boolean[] booleanArray = { true, false, true };
        result = ArrayUtils.contains(booleanArray, false);
        assertTrue(result);

        result = ArrayUtils.contains(booleanArray, null);
        assertFalse(result);

        Integer[] emptyArray = {};
        result = ArrayUtils.contains(emptyArray, 1);
        assertFalse(result);
    }

    @Test
    void testFind() {
        Integer[] array = { 1, 2, 3, 4, 5 };

        // Test finding an element that exists
        Predicate<Integer> predicate = x -> x == 3;
        Integer result = ArrayUtils.find(array, predicate);
        assertTrue(result != null && result == 3);

        // Test finding an element that does not exist
        predicate = x -> x == 6;
        result = ArrayUtils.find(array, predicate);
        assertTrue(result == null);

        // Test finding an element in an empty array
        Integer[] emptyArray = {};
        predicate = x -> x == 1;
        result = ArrayUtils.find(emptyArray, predicate);
        assertTrue(result == null);

        // Test finding an element with a complex predicate
        predicate = x -> x > 3 && x % 2 == 0;
        result = ArrayUtils.find(array, predicate);
        assertTrue(result != null && result == 4);

        // Test finding an element with null predicate
        assertThrowsExactly(NullPointerException.class, () -> ArrayUtils.find(array, null),
                "Should throw a NullPointerException.");
    }
}
