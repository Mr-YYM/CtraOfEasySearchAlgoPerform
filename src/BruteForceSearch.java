// 暴力查找
public class BruteForceSearch {
    public static Comparable rank(Comparable key, Comparable[] a) {
        for (Comparable ele : a) {
            if(ele==key) return ele;
        }
        return -1;
    }
}
