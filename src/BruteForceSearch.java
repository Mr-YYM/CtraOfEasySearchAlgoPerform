// 暴力查找
public class BruteForceSearch {
    public static Comparable rank(Comparable key, Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if(a[i]==key) return a[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(rank(2, new Integer[]{1, 2, 3}));
    }
}
