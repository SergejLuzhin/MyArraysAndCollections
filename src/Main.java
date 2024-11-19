import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int a = -10;
        int b = -2;
        int result = (a + b) >>> 1;
        System.out.println(result);*/

        byte[] a = new byte[]{2, 4, 5, 6, 8, 9, 10, 14, 15, 19, 20};
        byte key = 3;
        int result = MyArrays.binarySearch(a, key);

        System.out.println("1. Testing byte binary search.\nArray: " + Arrays.toString(a) + "\nLooking for: " + key);
        if (result >= 0) {
            System.out.printf("Element %d was found at index %d", key, result);
        } else {
            System.out.printf("Element %d was not found. Could be insert at index %d", key, -(result + 1));
        }
    }
}