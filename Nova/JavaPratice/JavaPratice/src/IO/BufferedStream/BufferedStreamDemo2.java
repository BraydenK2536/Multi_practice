package IO.BufferedStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IO\\BufferedStream\\csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\BufferedStream\\csbNew.txt"));
        String line;
        List<String> list = new ArrayList<>();
        while((line = br.readLine()) != null) {
            list.add(line);
        }
        list.sort(Comparator.comparingInt(o -> o.charAt(0)));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
