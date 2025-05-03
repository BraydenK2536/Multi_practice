package IO.BufferedStream;

import java.io.*;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        String filePath = "IO\\BufferedStream\\saves.txt";
        int saves = 0;

        // 读取文件内容
        BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            if (line != null) {
                saves = Integer.parseInt(line);
            }


        if (saves < 3) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
                bw.write(String.valueOf(++saves));
                System.out.println("剩余" + (4 - saves) + "次");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("次数已用完");
        }
    }
}