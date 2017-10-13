//二分查找
public class BinarySearch {
    public static Comparable rank(Comparable key, Comparable[] a){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if      (key.compareTo(a[mid])<0) hi = mid - 1;
            else if (key.compareTo(a[mid])>0) lo = mid + 1;
            else                            return a[mid];
        }
        return -1;
    }
}
