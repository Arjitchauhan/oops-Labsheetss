package lab_sheet_9.Q15;

import java.util.HashSet;

public class HashSetRemove {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.remove("Green");
        System.out.println("After removing Green: " + colors);
    }
}
