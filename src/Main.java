import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1. Byte binary search
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

    }
}