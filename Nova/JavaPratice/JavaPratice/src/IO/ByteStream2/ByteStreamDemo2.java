package IO.ByteStream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("IO.ByteStream2\\copyPath\\GTNH272Copy.rar", true);
        FileInputStream fis = new FileInputStream("IO.ByteStream2\\GTNH272.rar");
        int len;
        byte[] buf = new byte[1024 * 1024 * 50];
        while ((len = fis.read(buf)) != -1) {
            fos.write(buf, 0, len);

        }
        fis.close();
        fos.close();




    }
}
