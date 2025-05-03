package IO.ConvertStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IO\\ConvertStream\\gbkfile.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("IO\\ConvertStream\\utf8file.txt", Charset.forName("UTF-8"));
        int c;
        while((c = fr.read() ) != -1) {
            fw.write(c);
        }
        fr.close();
        fw.close();


    }
}
