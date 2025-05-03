package IO.ConvertStream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //利用转换流按照指定的字符集写出文件
        //jdk11之前方案
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IO\\ConvertStream\\demo2.txt",true), "GBK");
//        osw.write("阿阿斯顿");
//        osw.close();
        //jdk11之后方案
        FileWriter fw = new FileWriter("IO\\ConvertStream\\demo2.txt", Charset.forName("GBK"));
        fw.write("阿阿斯顿");
        fw.close();

    }
}
