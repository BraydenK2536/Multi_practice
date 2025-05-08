package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class test1 {
    public static void main(String[] args) throws IOException {
        Object[][] tabledatas;
        BufferedReader br = new BufferedReader(new FileReader("diary\\diary.txt"));
        String line;
        List<String> diaryLines = new ArrayList<>(); // 重命名以更清晰地表示这是日记中的行
        while ((line = br.readLine()) != null) {
            diaryLines.add(line);
        }
        br.close();

        String regex = "\\[[^,]+(,[^,]+){2}\\]"; // 正则表达式匹配如 "[item1,item2,item3]" 的格式
        Pattern pattern = Pattern.compile(regex);

        // 过滤符合正则表达式的行
        List<String> matchedLines = diaryLines.stream()
                .filter(s -> pattern.matcher(s).matches())
                .toList();

        // 创建二维数组
        tabledatas = new String[matchedLines.size()][];

        // 遍历每个匹配的行，提取内容并存储到二维数组
        for (int i = 0; i < matchedLines.size(); i++) {
            String currentLine = matchedLines.get(i);
            // 去掉首尾的方括号
            // 例如："[data1, data2, data3]" -> "data1, data2, data3"
            String content = currentLine.substring(1, currentLine.length() - 1);
            // 将内容按 ", " 分割成数组 (注意逗号后面可能跟着一个空格)
            // 或者，如果逗号后不一定有空格，可以使用更灵活的分割：content.split("\\s*,\\s*")
            tabledatas[i] = content.split(",\\s*"); // 按逗号和可选的空格分割
        }

        // 打印二维数组的内容
        for (int i = 0; i < tabledatas.length; i++) { // 遍历行
            System.out.print("行 " + (i + 1) + ": ");
            for (int j = 0; j < tabledatas[i].length; j++) { // 遍历列
                System.out.print(tabledatas[i][j] + " ");
            }
            System.out.println(); // 每行结束后换行
        }
    }
}