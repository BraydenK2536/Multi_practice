package Sort;

import java.util.Random;

public class QuickSortDemo1 {
    public static void main(String[] args) {
        //int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        int[] arr = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }

        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);


//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
    public static void quickSort(int[] arr, int i, int j) {
        int start = i, end = j;
        if (start > end) {
            return;
        }
        int baseNum = arr[i];
        while (start != end) {
            while (end > start && arr[end] >= baseNum) {
                end--;
            }
            while (end > start && arr[start] <= baseNum) {
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        quickSort(arr, i, start - 1);

        quickSort(arr, start + 1, j);
    }
}
