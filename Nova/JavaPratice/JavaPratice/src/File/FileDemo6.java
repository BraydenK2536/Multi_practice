package File;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        //需求：删除指定多级文件夹
        File f1 = new File("File\\test\\文件aaa夹1");
        deleteFolder(f1);


    }

    private static void deleteFolder(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File file1 : files) {
                    deleteFolder(file1);
                }
            }
        }
        file.delete();
    }
}
