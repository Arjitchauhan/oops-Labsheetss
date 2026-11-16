package lab_sheet_9.Q10;

import java.util.LinkedList;

public class LinkedListPrint {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Jaipur");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
