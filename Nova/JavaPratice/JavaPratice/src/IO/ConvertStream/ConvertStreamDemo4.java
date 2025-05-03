package IO.ConvertStream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("IO\\ConvertStream\\utf8file.txt")));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
