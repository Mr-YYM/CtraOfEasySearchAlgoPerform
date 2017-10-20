// 暴力查找
public class BruteForceSearch {
    public static int rank(Comparable key, Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }


}
