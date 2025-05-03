package test.chairTest;

import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class Chair {
    private static final int HALL_LENGTH = 30; // 会场长度，单位：椅子数
    private static final int HALL_WIDTH = 20;  // 会场宽度，单位：椅子数
    private static final int CHAIR_COUNT = 200; // 椅子总数
    private static final int AVAILABLE_CHAIR = HALL_LENGTH * HALL_WIDTH; // 可用椅子位置总数

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = new int[AVAILABLE_CHAIR];
        Set<Integer> set = new HashSet<>();

        // 随机生成椅子位置
        Random r = new Random();
        int temp = 1;
        while (temp <= CHAIR_COUNT) {
            int index = r.nextInt(AVAILABLE_CHAIR);
            if (!set.contains(index)) {
                arr[index] = temp;
                set.add(index);
                temp++;
            }
        }

        // 快速排序
        quickSort(arr, 0, AVAILABLE_CHAIR - 1);
        long end = System.currentTimeMillis();
        // 转换为二维数组
        int[][] res = to2DArray(arr, HALL_WIDTH, HALL_LENGTH);

        // 打印二维数组
        printArr(HALL_LENGTH, HALL_WIDTH, res);

        // 打印用时

        System.out.println("排序完成，用时 " + (end - start) + "ms");
    }

    private static void printArr(int length, int width, int[][] res) {
        // 打印二维数组
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                Integer num = res[i][j];
                if (num == 0) {
                    System.out.print(" ■  ");
                } else {
                    System.out.printf("%3d ", num);
                }
            }
            System.out.println();
        }
    }

    public static int[][] to2DArray(int[] arr, int width, int length) {
        int[][] res = new int[length][width];
        for (int i = 0; i < arr.length; i++) {
            // 计算行索引
            int rowIndex = i / width;
            // 计算列索引
            int colIndex = i % width;
            // 将一维数组的元素放到二维数组的正确位置
            res[rowIndex][colIndex] = arr[i];
        }
        return res;
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = arr[left];
        int start = left, end = right;
        while (start != end) {
            while (start < end && arr[end] >= pivot) {
                end--;
            }
            while (start < end && arr[start] <= pivot) {
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[left];
        arr[left] = arr[end];
        arr[end] = temp;

        quickSort(arr, left, end - 1);
        quickSort(arr, end + 1, right);
    }
}