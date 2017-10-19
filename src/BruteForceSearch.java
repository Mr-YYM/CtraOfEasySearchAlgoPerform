// 暴力查找
public class BruteForceSearch {
    public static Comparable rank(Comparable key, Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(key)) {
                return a[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(rank(1230, new Integer[]{1230, 2, 3}));
    }
}
