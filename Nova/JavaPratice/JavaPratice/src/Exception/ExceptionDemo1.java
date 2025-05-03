package Exception;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[554859]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界:" + e);
        }

        System.out.println("A");





    }
}
