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
        return 0;
    }

}
