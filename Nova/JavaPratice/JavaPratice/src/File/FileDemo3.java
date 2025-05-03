package File;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("File\\test\\a.txt");
        f1.createNewFile();
        File f2 = new File("File\\test\\文件夹");
        System.out.println(f2.mkdir());//mkdir只能创建一级目录
        File f3 = new File("File\\test\\文件aaa夹1\\e\\ae\\eqwe\\eqwea\\easdasd\\asdasdxce\\eaa");
        System.out.println(f3.mkdirs());//mkdirs可以创建多级目录
        File f4 = new File("File\\test\\文件夹");
        System.out.println(f4.delete());
        File f5 = new File("File\\test");
        System.out.println(Arrays.toString(f5.listFiles()));

    }
}
