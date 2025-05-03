package Exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            int max = getMax(arr);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("程序继续");

    }
    private static int getMax(int[] arr){
        if (arr == null) {
            throw new NullPointerException("数组不能为空");
        }
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("数组长度不能为0");
        }
        int max = arr[0];
        for (int i : arr) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
