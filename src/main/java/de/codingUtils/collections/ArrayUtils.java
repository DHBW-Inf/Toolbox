package de.codingUtils.collections;

import java.util.Arrays;

/**
 * The ArrayUtils class provides utility methods for manipulating arrays.
 */
public class ArrayUtils {

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @param <T>     the type of the array and element
     * @return the modified array with the element appended
     */
    public static <T> T[] Append(T[] array, T element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;

        return array;
    }

    /**
     * Inserts an element at the specified index in the array.
     *
     * @param array   the array to insert the element into
     * @param element the element to insert
     * @param index   the index at which to insert the element
     * @param <T>     the type of the array and element
     * @return the modified array with the element inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static <T> T[] Insert(T[] array, T element, int index) {
        if (index < 0 || index > array.length) throw new IndexOutOfBoundsException();

        T[] modified = Arrays.copyOf(array, array.length + 1);
        modified[index] = element;

        System.arraycopy(array, index, modified, index + 1, array.length - index);

        return modified;
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @param <T>   the type of the array
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static <T> T[] Remove(T[] array, int index) {
        if (index < 0 || index >= array.length) throw new IndexOutOfBoundsException();

        T[] modified = Arrays.copyOf(array, array.length - 1);

        System.arraycopy(array, 0, modified, 0, index);
        System.arraycopy(array, index + 1, modified, index, array.length - index - 1);

        return modified;
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @param <T>    the type of the arrays
     * @return the concatenated array
     */
    public static <T> T[] Concatenate(T[] array1, T[] array2) {
        T[] concatenated = Arrays.copyOf(array1, array1.length + array2.length);

        System.arraycopy(array2, 0, concatenated, array1.length, array2.length);

        return concatenated;
    }

    /**
     * Reverses the order of elements in the array.
     *
     * @param array the array to reverse
     * @param <T>   the type of the array
     * @return the reversed array
     */
    public static <T> T[] Reverse(T[] array) {
        T[] reversed = Arrays.copyOf(array, array.length);

        for (int i = 0; i < reversed.length / 2; i++) {
            T temp = reversed[i];
            reversed[i] = reversed[reversed.length - i - 1];
            reversed[reversed.length - i - 1] = temp;
        }

        return reversed;
    }
}
