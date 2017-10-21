import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 25000;
        Integer[] arr = SearchTestHelper.generateRandomArray(n, 1, 30000 );
        Integer[] keys = SearchTestHelper.generateRandomArray(n, 1, 30000 );
        Arrays.sort(arr);

//        BinarySearch part
        long start = System.currentTimeMillis();
        for (Integer key : keys) {
            BinarySearch.rank(key, arr);
        }
        long end = System.currentTimeMillis();
        System.out.printf("BinarySearch:%d ms\n",(end-start));

        //BruteForceSearch part
        start = System.currentTimeMillis();
        for (Integer key : keys) {
            BruteForceSearch.rank(key, arr);
        }
        end = System.currentTimeMillis();
        System.out.printf("BruteForceSearch:%d ms",(end-start));
    }
}
