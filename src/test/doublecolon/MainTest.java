package test.doublecolon;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainTest {
    public static void main(String [] args) {
        Convert<String, ColonTestImpl> construct = ColonTestImpl :: new;
        construct.convert("hello");
        Convert<String, Boolean> startWith = ColonTestImpl :: startWithAA;
        System.out.println(startWith.convert("AA"));
        Convert<String, Boolean> endWith = construct.convert("hello") :: endWithAA;
        System.out.println("end with: " + endWith.convert("AA"));
        ConvertNoParms<ColonTestImpl> constructNoParms = ColonTestImpl :: new;
        constructNoParms.exec();
        
        List<String> listData = Stream.of("1", "2", "3", "4").collect(Collectors.toList());
        listData.forEach(x -> {
            System.out.println(x);
        });
        listData.forEach(System.out :: println);
    }
}
