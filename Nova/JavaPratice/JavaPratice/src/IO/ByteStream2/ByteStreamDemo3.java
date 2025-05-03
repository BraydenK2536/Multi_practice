package IO.ByteStream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //需求：复制指定多级文件夹
        File f1 = new File("IO.ByteStream2\\eee");
        File f2 = new File("IO.ByteStream2\\copyPath\\eee");
        copyDir(f1, f2);
    }

    public static void copyDir(File src, File dest) throws IOException {
        if(!dest.exists()){
            dest.mkdirs();
        }
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    FileInputStream fis = new FileInputStream(file);
                    FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                    int len;
                    byte[] buf = new byte[1024];
                    while ((len = fis.read(buf)) != -1) {
                        fos.write(buf, 0, len);
                    }
                    fis.close();
                    fos.close();
                } else if (file.isDirectory()) {
                    File newDir = new File(dest, file.getName());
                    if (!newDir.exists()) {
                        newDir.mkdirs();
                    }
                    copyDir(file,newDir);
                }
            }
        }
    }
}
