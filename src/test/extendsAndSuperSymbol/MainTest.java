package test.extendsAndSuperSymbol;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class MainTest {
    public static void main(String [] args) {
        Apple apple = new Apple();
        apple.setName("apple");
        PlateImpl<Fruit> plate = new PlateImpl<>(apple);
        plate.put(new Apple());
        System.out.println(plate.get().getName());
        
        List<Fruit> test = new ArrayList<>();

        Apple apple2 = new Apple();
        apple2.setName("apple2");
        apple2.setTaste("sweet");
        test.add(apple2);
        Banana banana2 = new Banana();
        banana2.setName("banana2");
        banana2.setColor("yellow");
        test.add(banana2);
        for (Fruit fruit : test) {
            System.out.println(fruit.toString());
        }
        System.out.println(JSON.toJSON(test));
    }
}
