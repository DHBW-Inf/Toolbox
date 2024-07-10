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
}
