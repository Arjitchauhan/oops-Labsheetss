package lab_sheet_9.Q09;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Collections");
        words.add(" are");
        words.add(" useful");

        Collections.reverse(words);
        System.out.println(words);
    }
}
