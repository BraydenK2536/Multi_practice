package IO.ByteStream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        String wrap ="\r\n";
        byte[] bytes1 = wrap.getBytes();
        FileOutputStream fos = new FileOutputStream("ByteStream\\Demo2.txt",true);
        String str = "Hello World";
        //写入数据
        byte[] bytes = str.getBytes();
        fos.write(bytes);
        fos.write(bytes1);
        fos.write(bytes);
        fos.close();


    }
}
