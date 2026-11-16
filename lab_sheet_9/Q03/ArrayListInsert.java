package lab_sheet_9.Q03;

import java.util.ArrayList;

public class ArrayListInsert {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grape");

        fruits.add(1, "Banana");
        System.out.println(fruits);
    }
}
