//这个类用来生成，测试所需的随机数
public class SearchTestHelper {
    public static Integer[] generateRandomArray(int n, int rangeL, int rangeR){
        assert rangeL <= rangeR;

        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * (rangeR + 1 - rangeL) + rangeL);
        }

        return arr;
    }


}
