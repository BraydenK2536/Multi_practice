package File;



import java.io.File;
public class FileDemo1 {
    public static void main(String[] args) {
        System.out.println("================================文件=================================");
        File f1 = new File("E:\\Multi_practice\\Nova\\JavaPratice\\JavaPratice\\src\\File\\aaa.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.length());//返回文件的大小，单位是字节
        System.out.println("================================文件夹=================================");
        File f2 = new File("E:\\Multi_practice\\Nova\\JavaPratice\\JavaPratice\\src\\File\\bbb");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.length());
    }
}
