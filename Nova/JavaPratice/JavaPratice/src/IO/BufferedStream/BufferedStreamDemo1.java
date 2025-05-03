package IO.BufferedStream;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输入流演示
        BufferedReader br = new BufferedReader(new FileReader("IO\\BufferedStream\\a.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        //字符缓冲输出流演示
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\BufferedStream\\b.txt"));
        bw.write("Hello World");
        bw.newLine();
        bw.write("Hello World1");
        bw.close();
    }
}
