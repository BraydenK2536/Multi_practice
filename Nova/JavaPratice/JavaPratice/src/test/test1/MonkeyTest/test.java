package test.test1.MonkeyTest;

public class test {
    public static void main(String[] args) {
        System.out.println(getCount(1));
    }

    private static int getCount(int day) {
        if (day <= 0 || day > 11) {
            System.out.println("错误");
            return -1;
        }

        if (day == 10) {
            return 1;
        }

        return (getCount(day + 1) + 1) * 2;
    }
}
