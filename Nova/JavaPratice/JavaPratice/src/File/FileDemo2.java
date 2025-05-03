package File;
import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FileDemo2 {
    public static void main(String[] args) {
        System.out.println("===================getAbsolutePath===========================");
        File f1 = new File("asdasdqw.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println("===================getPath===========================");
        System.out.println(f1.getPath());
        System.out.println("===================getName==========================");
        System.out.println(f1.getName());
        System.out.println("==================lastModified========================");
        long l = f1.lastModified();
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(l), ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        String formattedDate = dateTime.format(formatter);
        System.out.println("Formatted last modified time: " + formattedDate);












    }
}
