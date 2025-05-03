package File;
import java.io.File;
import java.util.Arrays;

public class FileDemo4 {
    public static void main(String[] args) {
        // 需求：查找指定目录下的所有.txt文件
        File f1 = new File("File\\test");
        System.out.println(Arrays.toString(findTXT(f1)));
    }
    private static File[] findTXT(File f){
        return f.listFiles((File dir, String name) -> name.endsWith(".txt"));
    }
}
