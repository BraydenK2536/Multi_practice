package File;

import java.io.File;
import java.util.Arrays;

public class FileDemo5 {
    public static void main(String[] args) {
        //需求：找到指定目录下的所有.txt文件(考虑子文件夹)
        File f1 = new File("File\\test\\A");
        File[] files = f1.listFiles();
        for (File file : files) {
            findTXT(file);
        }

    }

    private static void findTXT(File f) {
        //判断是否是文件夹，并且文件夹不为空
        if (f.isDirectory()) {
            if (f.listFiles() != null) {
                //遍历文件夹下的所有文件夹和文件
                for (File file : f.listFiles()) {
                    findTXT(file);
                }
            }
        }
        if (f.isFile() && f.getName().endsWith(".txt")) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
