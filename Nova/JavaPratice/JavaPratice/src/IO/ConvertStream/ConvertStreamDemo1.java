package IO.ConvertStream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //利用转换流按照指定的字符集读写文件
        //jdk11以前方案
        InputStreamReader isr = new InputStreamReader(new FileInputStream("IO\\ConvertStream\\gbkfile.txt"),"GBK");
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }
        isr.close();
        //jdk11以后方案
        FileReader fr = new FileReader("IO\\ConvertStream\\gbkfile.txt", Charset.forName("GBK"));
        int ch2;
        System.out.println();
        while ((ch2 = fr.read()) != -1) {
            System.out.print((char) ch2);
        }

    }
}
