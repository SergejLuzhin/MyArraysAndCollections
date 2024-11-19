import java.util.Comparator;
import java.util.List;

public class MyCollections {
    static <T extends Comparable<T>> int binarySearch(List<T> list, T key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = list.get(mid);

            if (key.compareTo(midVal) > 0)
                low = ++mid;
            else if (key.compareTo(midVal) < 0)
                high = --mid;
            else
                return mid; //key found
        }
        return -(low + 1); //key not found
    }

    static <T> int binarySearch(List<T> list, T key, Comparator c) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = list.get(mid);
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
