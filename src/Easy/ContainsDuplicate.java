package Easy;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containDuplicate(int[] num){
        HashSet<Integer> set = new HashSet<>();
        for (int i: num){
            set.add(i);
        }
        return set.size() != num.length;
    }

    public static void main(String[] args) {
        System.out.println(containDuplicate(new int[]{1,2,3,1}));
    }
}
