package IO.ZipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip {
    public static void main(String[] args) throws IOException {
        // 压缩文件
        File src = new File("IO\\ZipStream\\aaa");
        File dest = new File("IO\\ZipStream\\aaaZip.zip");
        ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(dest));
        toZip(src, zip, "aaaZip");
        zip.close();
    }

    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    zos.putNextEntry(new ZipEntry(name + "\\" + file.getName()));
                    FileInputStream fis = new FileInputStream(file);
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = fis.read()) != -1) {
                        zos.write(bytes, 0, len);
                    }
                    fis.close();
                    zos.closeEntry();
                } else {
                    toZip(file, zos, name + "\\" + file.getName());
                }
            }
        }
    }
}
