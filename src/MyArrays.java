import java.util.Comparator;
import java.util.List;

public class MyArrays {
    static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) / 2; //не использовал побитовый оператор для возможности работы с отрицатльными числами
            byte midVal = a[mid];

            if (key > midVal)
                low = ++mid;
            else if (key < midVal)
                high = --mid;
            else
                return mid; //key found
        }
        return -(low + 1); //key not found
    }

    static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            char midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            double midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else {
                if (midVal == key)
                    return mid;             // Key found
                else if (midVal < key)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -(low + 1);
    }

    static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            float midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else {
                if (midVal == key)
                    return mid;             // Key found
                else if (midVal < key)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -(low + 1);
    }

    static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = a[mid];

            if (key > midVal)
                low = ++mid;
            else if (key < midVal)
                high = --mid;
            else
                return mid; //key found
        }
        return -(low + 1); //key not found
    }

    static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            long midVal = a[mid];

            if (key > midVal)
                low = ++mid;
            else if (key < midVal)
                high = --mid;
            else
                return mid; //key found
        }
        return -(low + 1); //key not found
    }

    static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            short midVal = a[mid];

            if (key > midVal)
                low = ++mid;
            else if (key < midVal)
                high = --mid;
            else
                return mid; //key found
        }
        return -(low + 1); //key not found
    }

    static <T> int binarySearch(T[] a, T key, Comparator c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = a[mid];
            int cmp = c.compare(midVal, key);
            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

}
