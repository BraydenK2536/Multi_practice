package IO.ZipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class unZip {
    public static void main(String[] args) throws IOException {
        //解压
        File src = new File("IO\\ZipStream\\qqq.zip");
        File dest = new File("IO\\ZipStream\\");
        unZip(src,dest);
    }

    public static void unZip(File src, File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        ZipEntry ze;
        while ((ze = zip.getNextEntry()) != null) {
            if(ze.isDirectory()) {
                File f= new File(dest,ze.toString());
                f.mkdirs();
            }else {
                File f = new File(dest,ze.toString());
                FileOutputStream fos = new FileOutputStream(f);
                byte[] buf = new byte[1024];
                while((zip.read(buf)) != -1) {
                    fos.write(buf);
                }

                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
