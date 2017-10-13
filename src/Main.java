import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 10000;
        Integer[] arr = SearchTestHelper.generateRandomArray(n, 1, 30000 );
        Arrays.sort(arr);

//        BinarySearch part
        int key = new Scanner(System.in).nextInt();
        long start = System.currentTimeMillis();
        key = (int) BinarySearch.rank(key,arr);
        long end = System.currentTimeMillis();
        System.out.printf("%d ms @%d\n",(end-start),key);

        //BruteForceSearch part
        start = System.currentTimeMillis();
        key = (int) BruteForceSearch.rank(key,arr);
        end = System.currentTimeMillis();
        System.out.printf("%d ms @%d",(end-start),key);
    }
}
