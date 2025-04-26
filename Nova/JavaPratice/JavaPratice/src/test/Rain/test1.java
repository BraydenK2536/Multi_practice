package test.Rain;

public class test1 {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        int max = 0;
        int index1 = -1, index2 = -1;
        int rainCount = 0;
        for (int i : height) {
            if (i > max) {
                max = i;
            }
        }
        int[][] arr = new int[height.length][max];
        //遍历x轴
        for (int i = 0; i < arr.length; i++) {
            int temp = height[i];
            //遍历y轴
            for (int j = 0; j < arr[i].length; j++) {
                if (temp != 0) {
                    arr[i][j] = 1;
                    temp--;
                }
            }
        }
        //反转数组
        int[][] arr1 = new int[max][height.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr1[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != 0) {
                    index1 = j;
                    break;
                }
            }
            for (int j = arr1[i].length - 1; j >= 0; j--) {
                if (arr1[i][j] != 0) {
                    index2 = j;
                    break;
                }
            }
            if (index1 != -1 && index2 != -1) {
                for (int j = index1; j < index2; j++) {
                    if (arr1[i][j] == 0) {
                        rainCount++;
                    }
                }
            }
            System.out.println("第" + i + "层" + "rain:" + rainCount);
        }
        System.out.println(rainCount);
    }
}