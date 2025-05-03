package IO.CharStream1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IO.CharStream1\\a.txt");
        FileWriter fw = new FileWriter("IO.CharStream1\\CopyTo\\aCpy.txt");
        int len;
        char[] buf = new char[2];
        while ((len = fr.read(buf)) != -1) {
            fw.write(buf,0,len);
        }
        fr.close();


    }
}
