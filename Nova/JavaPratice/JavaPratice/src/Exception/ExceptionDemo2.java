package Exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[554859]);
            System.out.println(2/0);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }







    }
}
