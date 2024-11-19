import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Byte binary search
        byte[] a = new byte[]{2, 4, 5, 6, 8, 9, 10, 14, 15, 19, 20};
        byte key = 3;
        int result = MyArrays.binarySearch(a, key);
        System.out.println("1. Testing byte binary search.\nArray: " + Arrays.toString(a) + "\nLooking for: " + key);
        if (result >= 0) {
            System.out.printf("Element %d was found at index %d", key, result);
        } else {
            System.out.printf("Element %d was not found. Could be insert at index %d", key, -(result + 1));
        }

        //Char binary search
        char[] charArray = new char[]{'a', 'b', 'd', 'g', 'i', 'k', 'o', 'q', 'z'};
        char charKey = 'b';
        result = MyArrays.binarySearch(charArray, charKey);
        System.out.println("\n\n2. Testing char binary search.\nArray: " + Arrays.toString(charArray) + "\nLooking for: " + charKey);
        if (result >= 0) {
            System.out.printf("Element %c was found at index %d", charKey, result);
        } else {
            System.out.printf("Element %c was not found. Could be insert at index %d", charKey, -(result + 1));
        }

        //Double binary search
        double[] doubleArray = new double[]{1.3d, 3.54d, 5.41d, 5.46d, 5.465d, 7.43d};
        double doubleKey = 7.430d;
        result = MyArrays.binarySearch(doubleArray, doubleKey);
        System.out.println("\n\n3. Testing double binary search.\nArray: " + Arrays.toString(doubleArray) + "\nLooking for: " + doubleKey);
        if (result >= 0) {
            System.out.printf("Element %.2f was found at index %d", doubleKey, result);
        } else {
            System.out.printf("Element %.2f was not found. Could be insert at index %d", doubleKey, -(result + 1));
        }

        //Float binary search
        float[] floatArray = new float[]{2.3f, 3.54f, 4.31f, 4.46f, 5.465f, 8.42f};
        float floatKey = 2.3f;
        result = MyArrays.binarySearch(floatArray, floatKey);
        System.out.println("\n\n4. Testing float binary search.\nArray: " + Arrays.toString(floatArray) + "\nLooking for: " + floatKey);
        if (result >= 0) {
            System.out.printf("Element %.2f was found at index %d", floatKey, result);
        } else {
            System.out.printf("Element %.2f was not found. Could be insert at index %d", floatKey, -(result + 1));
        }

        // Integer binary search
        int[] integerArray = new int[]{3, 4, 5, 7, 8, 9, 13, 14, 15, 22, 28};
        int integerKey = 7;
        result = MyArrays.binarySearch(integerArray, integerKey);
        System.out.println("\n\n5. Testing integer binary search.\nArray: " + Arrays.toString(integerArray) + "\nLooking for: " + integerKey);
        if (result >= 0) {
            System.out.printf("Element %d was found at index %d", integerKey, result);
        } else {
            System.out.printf("Element %d was not found. Could be insert at index %d", integerKey, -(result + 1));
        }

        // Long binary search
        long[] longArray = new long[]{334, 453, 555, 713, 8343, 9134, 13111, 14434, 15134, 2211113, 28343413};
        long longKey = 15134;
        result = MyArrays.binarySearch(longArray, longKey);
        System.out.println("\n\n6. Testing long binary search.\nArray: " + Arrays.toString(longArray) + "\nLooking for: " + longKey);
        if (result >= 0) {
            System.out.printf("Element %d was found at index %d", longKey, result);
        } else {
            System.out.printf("Element %d was not found. Could be insert at index %d", longKey, -(result + 1));
        }

        // Short binary search
        short[] shortArray = new short[]{0, 1, 3, 5, 22, 54, 89};
        short shortKey = 1;
        result = MyArrays.binarySearch(shortArray, shortKey);
        System.out.println("\n\n7. Testing short binary search.\nArray: " + Arrays.toString(shortArray) + "\nLooking for: " + shortKey);
        if (result >= 0) {
            System.out.printf("Element %d was found at index %d", shortKey, result);
        } else {
            System.out.printf("Element %d was not found. Could be insert at index %d", shortKey, -(result + 1));
        }
    }
}