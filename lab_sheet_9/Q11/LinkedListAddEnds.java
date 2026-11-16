package lab_sheet_9.Q11;

import java.util.LinkedList;

public class LinkedListAddEnds {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Study");
        tasks.add("Exercise");

        tasks.addFirst("Wake up");
        tasks.addLast("Sleep");
        System.out.println(tasks);
    }
}
