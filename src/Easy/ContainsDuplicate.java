package Easy;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containDuplicate(int[] num){
        HashSet<Integer> set = new HashSet<>();
        for (int i: num) {
            if (set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containDuplicate(new int[]{1,2,3,4}));
    }
}
