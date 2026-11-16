package lab_sheet_9.Q29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetToList {
    public static void main(String[] args) {
        Set<String> colors = new LinkedHashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        List<String> colorList = new ArrayList<>(colors);
        for (String color : colorList) {
            System.out.println(color);
        }
    }
}
