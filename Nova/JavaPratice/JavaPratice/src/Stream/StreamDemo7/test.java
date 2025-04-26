package Stream.StreamDemo7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        ArrayList<String> listMen = new ArrayList<>();
        Collections.addAll(listMen, "AQD,23", "DSF,25", "ASF,25", "QQDSF,25", "ZZDSF,25", "GHADVVDSF,25");

        ArrayList<String> listWomen = new ArrayList<>();
        Collections.addAll(listWomen, "GQQ,22", "GEE,22", "GASDQ,22", "AAAGAAQQ,22", "TYHJGQQ,22", "FGHGQQ,22");

        Stream<String> streamMen = listMen.stream().filter(s -> s.length() == 6).limit(2);
        Stream<String> streamWomen = listWomen.stream().filter(s -> s.startsWith("G")).skip(1);
        List<Actor> list = Stream.concat(streamMen, streamWomen).map(s -> {
            String name = s.split(",")[0];
            int age = Integer.parseInt(s.split(",")[1]);
            return new Actor(name, age);
        }).toList();

        System.out.println(list);


    }
}
