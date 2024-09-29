package de.tinf.collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {
    @Test
    void testAppend() {
        Integer[] array = { 1, 2, 3 };
        Integer[] expected = { 1, 2, 3, 4 };
        Integer[] result = ArrayUtils.Append(array, 4);
        assertArrayEquals(expected, result);
    }

    @Test
    void testInsert() {
        Integer[] array = { 1, 2, 3 };
        Integer[] expected = { 1, 2, 4, 3 };
        Integer[] result = ArrayUtils.Insert(array, 4, 2);
        assertArrayEquals(expected, result);

        assertThrowsExactly(IndexOutOfBoundsException.class, () -> ArrayUtils.Insert(array, 4, 4), "Should throw an IndexOutOfBoundsException.");
    }

    @Test
    void testRemove() {
        Integer[] array = { 1, 2, 3 };
        Integer[] expected = { 1, 3 };
        Integer[] result = ArrayUtils.Remove(array, 1);
        assertArrayEquals(expected, result);

        assertThrowsExactly(IndexOutOfBoundsException.class, () -> ArrayUtils.Remove(array, 3), "Should throw an IndexOutOfBoundsException.");
    }

    @Test
    void testConcatenate() {
        Integer[] array1 = { 1, 2, 3 };
        Integer[] array2 = { 4, 5, 6 };
        Integer[] expected = { 1, 2, 3, 4, 5, 6 };
        Integer[] result = ArrayUtils.Concatenate(array1, array2);
        assertArrayEquals(expected, result);

        array2 = new Integer[0];
        expected = array1;
        result = ArrayUtils.Concatenate(array1, array2);
        assertArrayEquals(expected, result);
    }

    @Test
    void testReverse() {
        Integer[] array = { 1, 2, 3 };
        Integer[] expected = { 3, 2, 1 };
        Integer[] result = ArrayUtils.Reverse(array);
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
}
