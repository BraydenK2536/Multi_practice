package IO.ByteStream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IO.ByteStream2\\Demo1.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();

    }
}
