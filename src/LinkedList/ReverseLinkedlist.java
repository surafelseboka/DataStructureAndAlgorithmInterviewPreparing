package LinkedList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedlist {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
