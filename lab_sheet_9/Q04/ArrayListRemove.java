package lab_sheet_9.Q04;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Green");

        colors.remove(0);
        System.out.println("After removing index 0: " + colors);

        colors.remove("Green");
        System.out.println("After removing the first Green: " + colors);
    }
}
