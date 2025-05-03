package IO.ByteStream2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringJoiner;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //将Demo4.txt中的2-1-9-4-7-8排序后存储
        FileReader fr = new FileReader("IO.ByteStream2\\Demo4.txt");
        FileWriter fw = new FileWriter("IO.ByteStream2\\Demo4New.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();
        //方案1
        Integer[] list = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted(Integer::compareTo)
                .toArray(Integer[]::new);
        //方案2
//        String str = sb.toString();
//        String[] arrStr = str.split("-");
//        ArrayList<Integer> list = new ArrayList<>();
//        for (String s : arrStr) {
//            list.add(Integer.parseInt(s));
//        }
//        list.sort(Integer::compareTo);
        
        StringJoiner sj = new StringJoiner("-");
        for (Integer i : list) {
            sj.add(i.toString());
        }
        fw.write(sj.toString());
        fw.close();

    }
}
