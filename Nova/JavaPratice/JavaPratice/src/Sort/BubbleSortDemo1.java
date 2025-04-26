package Sort;

public class BubbleSortDemo1 {
    public static void main(String[] args) {
        int[] arr = {6451,-1,54815461 ,2,8,4,9,7,20,54,654};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j]>arr[j +1]){
                    int temp =arr[j];
                    arr[j] = arr[j +1];
                    arr[j +1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
