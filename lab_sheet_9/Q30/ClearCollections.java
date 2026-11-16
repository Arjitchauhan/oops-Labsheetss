package lab_sheet_9.Q30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class ClearCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");

        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");

        list.clear();
        set.clear();
        queue.clear();

        System.out.println("List after clear: " + list);
        System.out.println("Set after clear: " + set);
        System.out.println("Queue after clear: " + queue);
    }
}
