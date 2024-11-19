public class MyArrays {
    static int binarySearch(byte[] a, byte key){
        return binarySearch(a, 0, a.length, key);
    }

    static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key){
        int low = fromIndex;
        int high = toIndex - 1;

        while(low <= high){
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

}
