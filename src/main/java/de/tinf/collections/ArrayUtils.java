package de.tinf.collections;

import java.util.Arrays;

/**
 * The ArrayUtils class provides utility methods for manipulating arrays.
 */
public class ArrayUtils {

    /**
     * Converts an array of objects to an array of primitive values.
     *
     * @param array the array of objects to be converted
     * @return an array of primitive values corresponding to the input array
     */
    public static byte[] toPrimitiveArray(Byte[] array) {
        byte[] casted = new byte[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts an array of objects to an array of primitive values.
     *
     * @param array the array of objects to be converted
     * @return an array of primitive values corresponding to the input array
     */
    public static short[] toPrimitiveArray(Short[] array) {
        short[] casted = new short[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts an array of objects to an array of primitive values.
     *
     * @param array the array of objects to be converted
     * @return an array of primitive values corresponding to the input array
     */
    public static int[] toPrimitiveArray(Integer[] array) {
        return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }

    /**
     * Converts an array of objects to an array of primitive values.
     *
     * @param array the array of objects to be converted
     * @return an array of primitive values corresponding to the input array
     */
    public static long[] toPrimitiveArray(Long[] array) {
        return Arrays.stream(array).mapToLong(Long::longValue).toArray();
    }

    /**
     * Converts an array of objects to an array of primitive values.
     *
     * @param array the array of objects to be converted
     * @return an array of primitive values corresponding to the input array
     */
    public static float[] toPrimitiveArray(Float[] array) {
        float[] casted = new float[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts an array of objects to an array of primitive values.
     *
     * @param array the array of objects to be converted
     * @return an array of primitive values corresponding to the input array
     */
    public static double[] toPrimitiveArray(Double[] array) {
        return Arrays.stream(array).mapToDouble(Double::doubleValue).toArray();
    }

    /**
     * Converts an array of objects to an array of primitive values.
     *
     * @param array the array of objects to be converted
     * @return an array of primitive values corresponding to the input array
     */
    public static char[] toPrimitiveArray(Character[] array) {
        char[] casted = new char[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts an array of objects to an array of primitive values.
     *
     * @param array the array of objects to be converted
     * @return an array of primitive values corresponding to the input array
     */
    public static boolean[] toPrimitiveArray(Boolean[] array) {
        boolean[] casted = new boolean[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts a primitive type array to an array of objects.
     *
     * @param array the primitive type array to be converted
     * @return an array of objects corresponding to the input array
     */
    public static Byte[] toObjectArray(byte[] array) {
        Byte[] casted = new Byte[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts a primitive type array to an array of objects.
     *
     * @param array the primitive type array to be converted
     * @return an array of objects corresponding to the input array
     */
    public static Short[] toObjectArray(short[] array) {
        Short[] casted = new Short[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts a primitive type array to an array of objects.
     *
     * @param array the primitive type array to be converted
     * @return an array of objects corresponding to the input array
     */
    public static Integer[] toObjectArray(int[] array) {
        return Arrays.stream(array).boxed().toArray(Integer[]::new);
    }

    /**
     * Converts a primitive type array to an array of objects.
     *
     * @param array the primitive type array to be converted
     * @return an array of objects corresponding to the input array
     */
    public static Long[] toObjectArray(long[] array) {
        return Arrays.stream(array).boxed().toArray(Long[]::new);
    }

    /**
     * Converts a primitive type array to an array of objects.
     *
     * @param array the primitive type array to be converted
     * @return an array of objects corresponding to the input array
     */
    public static Float[] toObjectArray(float[] array) {
        Float[] casted = new Float[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts a primitive type array to an array of objects.
     *
     * @param array the primitive type array to be converted
     * @return an array of objects corresponding to the input array
     */
    public static Double[] toObjectArray(double[] array) {
        return Arrays.stream(array).boxed().toArray(Double[]::new);
    }

    /**
     * Converts a primitive type array to an array of objects.
     *
     * @param array the primitive type array to be converted
     * @return an array of objects corresponding to the input array
     */
    public static Character[] toObjectArray(char[] array) {
        Character[] casted = new Character[array.length];
        for (int i = 0; i < casted.length; i++) {
            casted[i] = array[i];
        }

        return casted;
    }

    /**
     * Converts a primitive type array to an array of objects.
     *
     * @param array the primitive type array to be converted
     * @return an array of objects corresponding to the input array
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
    public static byte[] Append(byte[] array, byte element) {
        return toPrimitiveArray(Append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static short[] Append(short[] array, short element) {
        return toPrimitiveArray(Append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static int[] Append(int[] array, int element) {
        return toPrimitiveArray(Append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static long[] Append(long[] array, long element) {
        return toPrimitiveArray(Append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static float[] Append(float[] array, float element) {
        return toPrimitiveArray(Append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static double[] Append(double[] array, double element) {
        return toPrimitiveArray(Append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static char[] Append(char[] array, char element) {
        return toPrimitiveArray(Append(toObjectArray(array), element));
    }

    /**
     * Appends an element to the end of the array.
     *
     * @param array   the array to append the element to
     * @param element the element to append
     * @return the modified array with the element appended
     */
    public static boolean[] Append(boolean[] array, boolean element) {
        return toPrimitiveArray(Append(toObjectArray(array), element));
    }

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
     * @return the modified array with the element inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static byte[] Insert(byte[] array, byte element, int index) {
        return toPrimitiveArray(Insert(toObjectArray(array), element, index));
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
    public static short[] Insert(short[] array, short element, int index) {
        return toPrimitiveArray(Insert(toObjectArray(array), element, index));
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
    public static int[] Insert(int[] array, int element, int index) {
        return toPrimitiveArray(Insert(toObjectArray(array), element, index));
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
    public static long[] Insert(long[] array, long element, int index) {
        return toPrimitiveArray(Insert(toObjectArray(array), element, index));
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
    public static float[] Insert(float[] array, float element, int index) {
        return toPrimitiveArray(Insert(toObjectArray(array), element, index));
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
    public static double[] Insert(double[] array, double element, int index) {
        return toPrimitiveArray(Insert(toObjectArray(array), element, index));
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
    public static char[] Insert(char[] array, char element, int index) {
        return toPrimitiveArray(Insert(toObjectArray(array), element, index));
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
    public static boolean[] Insert(boolean[] array, boolean element, int index) {
        return toPrimitiveArray(Insert(toObjectArray(array), element, index));
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
    public static byte[] Remove(byte[] array, int index) {
        return toPrimitiveArray(Remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static short[] Remove(short[] array, int index) {
        return toPrimitiveArray(Remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static int[] Remove(int[] array, int index) {
        return toPrimitiveArray(Remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static long[] Remove(long[] array, int index) {
        return toPrimitiveArray(Remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static float[] Remove(float[] array, int index) {
        return toPrimitiveArray(Remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static double[] Remove(double[] array, int index) {
        return toPrimitiveArray(Remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static char[] Remove(char[] array, int index) {
        return toPrimitiveArray(Remove(toObjectArray(array), index));
    }

    /**
     * Removes an element at the specified index from the array.
     *
     * @param array the array to remove the element from
     * @param index the index of the element to remove
     * @return the modified array with the element removed
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public static boolean[] Remove(boolean[] array, int index) {
        return toPrimitiveArray(Remove(toObjectArray(array), index));
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
    public static byte[] Concatenate(byte[] array1, byte[] array2) {
        return toPrimitiveArray(Concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static short[] Concatenate(short[] array1, short[] array2) {
        return toPrimitiveArray(Concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static int[] Concatenate(int[] array1, int[] array2) {
        return toPrimitiveArray(Concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static long[] Concatenate(long[] array1, long[] array2) {
        return toPrimitiveArray(Concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static float[] Concatenate(float[] array1, float[] array2) {
        return toPrimitiveArray(Concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static double[] Concatenate(double[] array1, double[] array2) {
        return toPrimitiveArray(Concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static char[] Concatenate(char[] array1, char[] array2) {
        return toPrimitiveArray(Concatenate(toObjectArray(array1), toObjectArray(array2)));
    }

    /**
     * Concatenates two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the concatenated array
     */
    public static boolean[] Concatenate(boolean[] array1, boolean[] array2) {
        return toPrimitiveArray(Concatenate(toObjectArray(array1), toObjectArray(array2)));
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
