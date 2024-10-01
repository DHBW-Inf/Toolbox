package de.tinf.collections;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The ArrayUtils class provides utility methods for manipulating arrays.
 */
public class ArrayUtils {

    /**
     * Converts an array of {@link Byte} objects to an array of primitive
     * {@code byte}s.
     *
     * @param array the array of {@link Byte} objects to be converted
     * @return an array of primitive {@code byte}s corresponding to the input array
     */
    public static byte[] toPrimitiveArray(Byte[] array) {
        byte[] casted = new byte[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts an array of {@link Short} objects to an array of primitive
     * {@code short} values.
     *
     * @param array the array of {@link Short} objects to be converted
     * @return an array of primitive {@code short} values corresponding to the input
     *         array
     */
    public static short[] toPrimitiveArray(Short[] array) {
        short[] casted = new short[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts an array of {@link Integer} objects to an array of primitive
     * {@code int}s.
     *
     * @param array the array of {@link Integer} objects to be converted
     * @return an array of primitive {@code int}s corresponding to the input array
     */
    public static int[] toPrimitiveArray(Integer[] array) {
        return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }

    /**
     * Converts an array of {@link Long} objects to an array of primitive
     * {@code long} values.
     *
     * @param array the array of {@link Long} objects to be converted
     * @return an array of primitive {@code long} values corresponding to the input
     *         array
     */
    public static long[] toPrimitiveArray(Long[] array) {
        return Arrays.stream(array).mapToLong(Long::longValue).toArray();
    }

    /**
     * Converts an array of {@link Float} objects to an array of primitive
     * {@code float} values.
     *
     * @param array the array of {@link Float} objects to be converted
     * @return an array of primitive {@code float} values corresponding to the input
     *         array
     */
    public static float[] toPrimitiveArray(Float[] array) {
        float[] casted = new float[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts an array of {@link Double} objects to an array of primitive
     * {@code double} values.
     *
     * @param array the array of {@link Double} objects to be converted
     * @return an array of primitive {@code double} values corresponding to the
     *         input array
     */
    public static double[] toPrimitiveArray(Double[] array) {
        return Arrays.stream(array).mapToDouble(Double::doubleValue).toArray();
    }

    /**
     * Converts an array of {@link Character} objects to an array of primitive
     * {@code char} values.
     *
     * @param array the array of {@link Character} objects to be converted
     * @return an array of primitive {@code char} values corresponding to the input
     *         array
     */
    public static char[] toPrimitiveArray(Character[] array) {
        char[] casted = new char[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts an array of {@link Boolean} objects to an array of primitive
     * {@code boolean} values.
     *
     * @param array the array of {@link Boolean} objects to be converted
     * @return an array of primitive {@code boolean} values corresponding to the
     *         input array
     */
    public static boolean[] toPrimitiveArray(Boolean[] array) {
        boolean[] casted = new boolean[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts an array of primitive {@code byte}s to an array of {@link Byte}
     * objects.
     * 
     * @param array the array of {@code byte}s to be converted
     * @return an array of {@link Byte} objects
     */
    public static Byte[] toObjectArray(byte[] array) {
        Byte[] casted = new Byte[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts an array of primitive {@code short} values to an array of
     * {@link Short} objects.
     * 
     * @param array the array of {@code short} values to be converted
     * @return an array of {@link Short} objects
     */
    public static Short[] toObjectArray(short[] array) {
        Short[] casted = new Short[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts an array of primitive {@code int}s to an array of {@link Integer}
     * objects.
     * 
     * @param array the array of {@code int}s to be converted
     * @return an array of {@link Integer} objects
     */
    public static Integer[] toObjectArray(int[] array) {
        return Arrays.stream(array).boxed().toArray(Integer[]::new);
    }

    /**
     * Converts an array of primitive {@code long} values to an array of
     * {@link Long} objects.
     * 
     * @param array the array of {@code long} values to be converted
     * @return an array of {@link Long} objects
     */
    public static Long[] toObjectArray(long[] array) {
        return Arrays.stream(array).boxed().toArray(Long[]::new);
    }

    /**
     * Converts an array of primitive {@code float}s to an array of {@link Float}
     * objects.
     * 
     * @param array the array of {@code float}s to be converted
     * @return an array of {@link Float} objects
     */
    public static Float[] toObjectArray(float[] array) {
        Float[] casted = new Float[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts an array of primitive {@code double}s to an array of {@link Double}
     * objects.
     * 
     * @param array the array of {@code double}s to be converted
     * @return an array of {@link Double} objects
     */
    public static Double[] toObjectArray(double[] array) {
        return Arrays.stream(array).boxed().toArray(Double[]::new);
    }

    /**
     * Converts an array of primitive {@code char}s to an array of {@link Character}
     * objects.
     * 
     * @param array the array of {@code char}s to be converted
     * @return an array of {@link Character} objects
     */
    public static Character[] toObjectArray(char[] array) {
        Character[] casted = new Character[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts an array of primitive {@code boolean}s to an array of
     * {@link Boolean} objects.
     * 
     * @param array the array of {@code boolean}s to be converted
     * @return an array of {@link Boolean} objects
     */
    public static Boolean[] toObjectArray(boolean[] array) {
        Boolean[] casted = new Boolean[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static byte[] append(byte[] array, byte element) {
        return toPrimitiveArray(append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static short[] append(short[] array, short element) {
        return toPrimitiveArray(append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static int[] append(int[] array, int element) {
        return toPrimitiveArray(append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static long[] append(long[] array, long element) {
        return toPrimitiveArray(append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static float[] append(float[] array, float element) {
        return toPrimitiveArray(append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static double[] append(double[] array, double element) {
        return toPrimitiveArray(append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static char[] append(char[] array, char element) {
        return toPrimitiveArray(append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static boolean[] append(boolean[] array, boolean element) {
        return toPrimitiveArray(append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @param <T>     the type of the array and element
     * @return the modified array with the element appended
     */
    public static <T> T[] append(T[] array, T element) {
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
     * @return the modified array with the element inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static byte[] insert(byte[] array, byte element, int index) {
        return toPrimitiveArray(insert(toObjectArray(array), element, index));
    }

    /**
     * Inserts an element at the specified index in the array.
     *
     * @param array   the array to insert the element into
     * @param element the element to insert
     * @param index   the index at which to insert the element
     * @return the modified array with the element inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static short[] insert(short[] array, short element, int index) {
        return toPrimitiveArray(insert(toObjectArray(array), element, index));
    }

    /**
     * Inserts an element at the specified index in the array.
     *
     * @param array   the array to insert the element into
     * @param element the element to insert
     * @param index   the index at which to insert the element
     * @return the modified array with the element inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static int[] insert(int[] array, int element, int index) {
        return toPrimitiveArray(insert(toObjectArray(array), element, index));
    }

    /**
     * Inserts an element at the specified index in the array.
     *
     * @param array   the array to insert the element into
     * @param element the element to insert
     * @param index   the index at which to insert the element
     * @return the modified array with the element inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static long[] insert(long[] array, long element, int index) {
        return toPrimitiveArray(insert(toObjectArray(array), element, index));
    }

    /**
     * Inserts an element at the specified index in the array.
     *
     * @param array   the array to insert the element into
     * @param element the element to insert
     * @param index   the index at which to insert the element
     * @return the modified array with the element inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static float[] insert(float[] array, float element, int index) {
        return toPrimitiveArray(insert(toObjectArray(array), element, index));
    }

    /**
     * Inserts an element at the specified index in the array.
     *
     * @param array   the array to insert the element into
     * @param element the element to insert
     * @param index   the index at which to insert the element
     * @return the modified array with the element inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static double[] insert(double[] array, double element, int index) {
        return toPrimitiveArray(insert(toObjectArray(array), element, index));
    }

    /**
     * Inserts an element at the specified index in the array.
     *
     * @param array   the array to insert the element into
     * @param element the element to insert
     * @param index   the index at which to insert the element
     * @return the modified array with the element inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static char[] insert(char[] array, char element, int index) {
        return toPrimitiveArray(insert(toObjectArray(array), element, index));
    }

    /**
     * Inserts an element at the specified index in the array.
     *
     * @param array   the array to insert the element into
     * @param element the element to insert
     * @param index   the index at which to insert the element
     * @return the modified array with the element inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static boolean[] insert(boolean[] array, boolean element, int index) {
        return toPrimitiveArray(insert(toObjectArray(array), element, index));
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
    public static <T> T[] insert(T[] array, T element, int index) {
        if (index < 0 || index > array.length)
            throw new IndexOutOfBoundsException();

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
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static byte[] remove(byte[] array, int index) {
        return toPrimitiveArray(remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static short[] remove(short[] array, int index) {
        return toPrimitiveArray(remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static int[] remove(int[] array, int index) {
        return toPrimitiveArray(remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static long[] remove(long[] array, int index) {
        return toPrimitiveArray(remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static float[] remove(float[] array, int index) {
        return toPrimitiveArray(remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static double[] remove(double[] array, int index) {
        return toPrimitiveArray(remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static char[] remove(char[] array, int index) {
        return toPrimitiveArray(remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static boolean[] remove(boolean[] array, int index) {
        return toPrimitiveArray(remove(toObjectArray(array), index));
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
    public static <T> T[] remove(T[] array, int index) {
        if (index < 0 || index >= array.length)
            throw new IndexOutOfBoundsException();

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
     * @return the concatenated array
     */
    public static byte[] concatenate(byte[] array1, byte[] array2) {
        return toPrimitiveArray(concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static short[] concatenate(short[] array1, short[] array2) {
        return toPrimitiveArray(concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static int[] concatenate(int[] array1, int[] array2) {
        return toPrimitiveArray(concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static long[] concatenate(long[] array1, long[] array2) {
        return toPrimitiveArray(concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static float[] concatenate(float[] array1, float[] array2) {
        return toPrimitiveArray(concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static double[] concatenate(double[] array1, double[] array2) {
        return toPrimitiveArray(concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static char[] concatenate(char[] array1, char[] array2) {
        return toPrimitiveArray(concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static boolean[] concatenate(boolean[] array1, boolean[] array2) {
        return toPrimitiveArray(concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @param <T>    the type of the arrays
     * @return the concatenated array
     */
    public static <T> T[] concatenate(T[] array1, T[] array2) {
        T[] concatenated = Arrays.copyOf(array1, array1.length + array2.length);

        System.arraycopy(array2, 0, concatenated, array1.length, array2.length);

        return concatenated;
    }

    /**
     * Reverses the order of elements in the array.
     *
     * @param array the array to reverse
     * @return the reversed array
     */
    public static byte[] reverse(byte[] array) {
        return toPrimitiveArray(reverse(toObjectArray(array)));
    }

    /**
     * Reverses the order of elements in the array.
     *
     * @param array the array to reverse
     * @return the reversed array
     */
    public static short[] reverse(short[] array) {
        return toPrimitiveArray(reverse(toObjectArray(array)));
    }

    /**
     * Reverses the order of elements in the array.
     *
     * @param array the array to reverse
     * @return the reversed array
     */
    public static int[] reverse(int[] array) {
        return toPrimitiveArray(reverse(toObjectArray(array)));
    }

    /**
     * Reverses the order of elements in the array.
     *
     * @param array the array to reverse
     * @return the reversed array
     */
    public static long[] reverse(long[] array) {
        return toPrimitiveArray(reverse(toObjectArray(array)));
    }

    /**
     * Reverses the order of elements in the array.
     *
     * @param array the array to reverse
     * @return the reversed array
     */
    public static float[] reverse(float[] array) {
        return toPrimitiveArray(reverse(toObjectArray(array)));
    }

    /**
     * Reverses the order of elements in the array.
     *
     * @param array the array to reverse
     * @return the reversed array
     */
    public static double[] reverse(double[] array) {
        return toPrimitiveArray(reverse(toObjectArray(array)));
    }

    /**
     * Reverses the order of elements in the array.
     *
     * @param array the array to reverse
     * @return the reversed array
     */
    public static char[] reverse(char[] array) {
        return toPrimitiveArray(reverse(toObjectArray(array)));
    }

    /**
     * Reverses the order of elements in the array.
     *
     * @param array the array to reverse
     * @return the reversed array
     */
    public static boolean[] reverse(boolean[] array) {
        return toPrimitiveArray(reverse(toObjectArray(array)));
    }

    /**
     * Reverses the order of elements in the array.
     *
     * @param array the array to reverse
     * @param <T>   the type of the array
     * @return the reversed array
     */
    public static <T> T[] reverse(T[] array) {
        T[] reversed = Arrays.copyOf(array, array.length);

        for (int i = 0; i < reversed.length / 2; i++) {
            T temp = reversed[i];
            reversed[i] = reversed[reversed.length - i - 1];
            reversed[reversed.length - i - 1] = temp;
        }

        return reversed;
    }

    public static boolean contains(byte[] array, byte element) {
        return contains(toObjectArray(array), element);
    }

    /**
     * Checks if the specified array contains the given element.
     *
     * @param array   the array to be checked for the presence of the element
     * @param element the element to be checked for in the array
     * @return {@code true} if the array contains the specified element,
     *         {@code false} otherwise
     */
    public static boolean contains(short[] array, short element) {
        return contains(toObjectArray(array), element);
    }

    /**
     * Checks if the specified array contains the given element.
     *
     * @param array   the array to be checked for the presence of the element
     * @param element the element to be checked for in the array
     * @return {@code true} if the array contains the specified element,
     *         {@code false} otherwise
     */
    public static boolean contains(int[] array, int element) {
        return contains(toObjectArray(array), element);
    }

    /**
     * Checks if the specified array contains the given element.
     *
     * @param array   the array to be checked for the presence of the element
     * @param element the element to be checked for in the array
     * @return {@code true} if the array contains the specified element,
     *         {@code false} otherwise
     */
    public static boolean contains(long[] array, long element) {
        return contains(toObjectArray(array), element);
    }

    /**
     * Checks if the specified array contains the given element.
     *
     * @param array   the array to be checked for the presence of the element
     * @param element the element to be checked for in the array
     * @return {@code true} if the array contains the specified element,
     *         {@code false} otherwise
     */
    public static boolean contains(float[] array, float element) {
        return contains(toObjectArray(array), element);
    }

    /**
     * Checks if the specified array contains the given element.
     *
     * @param array   the array to be checked for the presence of the element
     * @param element the element to be checked for in the array
     * @return {@code true} if the array contains the specified element,
     *         {@code false} otherwise
     */
    public static boolean contains(double[] array, double element) {
        return contains(toObjectArray(array), element);
    }

    /**
     * Checks if the specified array contains the given element.
     *
     * @param array   the array to be checked for the presence of the element
     * @param element the element to be checked for in the array
     * @return {@code true} if the array contains the specified element,
     *         {@code false} otherwise
     */
    public static boolean contains(char[] array, char element) {
        return contains(toObjectArray(array), element);
    }

    /**
     * Checks if the specified array contains the given element.
     *
     * @param array   the array to be checked for the presence of the element
     * @param element the element to be checked for in the array
     * @return {@code true} if the array contains the specified element,
     *         {@code false} otherwise
     */
    public static boolean contains(boolean[] array, boolean element) {
        return contains(toObjectArray(array), element);
    }

    /**
     * Checks if the specified array contains the given element.
     *
     * @param array   the array to be checked for the presence of the element
     * @param element the element to be checked for in the array
     * @return {@code true} if the array contains the specified element,
     *         {@code false} otherwise
     */
    public static <T> boolean contains(T[] array, T element) {
        if (element == null) {
            return false;
        }

        return Arrays.stream(array).anyMatch(element::equals);
    }
}
