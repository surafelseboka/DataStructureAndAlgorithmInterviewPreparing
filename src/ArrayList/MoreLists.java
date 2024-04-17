package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {

        String[] items = {"apple","banana","orange"};
        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yoghurt");

        System.out.println(groceries);
        System.out.println(list.getClass().getSimpleName());

        groceries.sort(Comparator.naturalOrder());
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var listOne = List.of(1,2,3,4,5,6,7);
        System.out.println(listOne);
    }
}
