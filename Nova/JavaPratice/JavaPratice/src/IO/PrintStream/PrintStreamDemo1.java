package IO.PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("IO\\PrintStream\\ps.txt"));
        ps.println("Hello World");
        ps.print(97);
        ps.println();
        ps.printf("%s,%S","1","2");
        ps.close();


    }
}
