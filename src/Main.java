import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 10000;
        Integer[] arr = SearchTestHelper.generateRandomArray(n, 1, 30000 );
        Integer[] keys = SearchTestHelper.generateRandomArray(n, 1, 30000 );
        Arrays.sort(arr);

//        BinarySearch part
        long start = System.currentTimeMillis();
        for (int i = 0; i < keys.length; i++) {
            BinarySearch.rank(keys[i],arr);
        }
        long end = System.currentTimeMillis();
        System.out.printf("BinarySearch:%d ms\n",(end-start));

        //BruteForceSearch part
        start = System.currentTimeMillis();
        for (int i = 0; i < keys.length; i++) {
            BruteForceSearch.rank(keys[i],arr);
        }
        end = System.currentTimeMillis();
        System.out.printf("BruteForceSearch:%d ms",(end-start));
    }
}
