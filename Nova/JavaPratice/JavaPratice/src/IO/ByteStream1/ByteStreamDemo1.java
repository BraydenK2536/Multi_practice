package IO.ByteStream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        byte[] bytes ={65,66,67,68,69};
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("ByteStream\\Demo1.txt");
        //写入数据
        fos.write(bytes);
        //释放资源
        fos.close();

    }
}
