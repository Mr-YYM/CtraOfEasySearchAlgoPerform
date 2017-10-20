// 二分查找
// 二分查找法，在有序数组arr中查找key
// 如果找到key，返回相应的索引
// 如果没有找到key，返回-1

public class BinarySearch {
    public static int rank(Comparable key, Comparable[] arr){
        // 在[left,right]之间查找key
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if        (key.compareTo(arr[mid])<0) {
                // 在[left,mid-1]之间查找key
                right = mid - 1;
            }
            else if (key.compareTo(arr[mid])>0) {
                // 在[mid+1,right]之间查找key
                left = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] keys = new Integer[]{0,2,4,6,8,10,12,14};
        Integer[] a = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        for (int key : keys) {
            if(rank(key, a) != -1){
                System.out.printf("找到了%d\n",key);
            }
            else {
                System.out.printf("没找到%d\n",key);
            }
        }
    }
}
