package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        String name;
        int age;
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("请输入学生姓名:");
                name = sc.nextLine();
                if (name.length() < 3 || name.length() > 10) {
                    throw new NameInputException("姓名长度不符合要求");
                }

                System.out.println("请输入学生年龄:");
                age = sc.nextInt();
                if (age < 18 || age > 40) {
                    throw new InputMismatchException("年龄不符合要求");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }catch (NameInputException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(age + "岁的" + name);


    }
}
