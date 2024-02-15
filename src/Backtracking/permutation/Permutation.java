package Backtracking.permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static List<List<String>> permute(String[] s){

        List<List<String>> result = new ArrayList<>();
        permute(s, new ArrayList<>(), result);
        return result;
    }

    public static void permute(String[] num, List<String> currentPermute,
                        List<List<String>> permute ){
        if (currentPermute.size() == num.length){
            permute.add(new ArrayList<>(currentPermute));
            return;
        }

        for (int i=0; i < num.length; i++){
            if (currentPermute.contains(num[i])) continue;
            currentPermute.add(String.valueOf(num[i]));
            permute(num, currentPermute, permute);
            currentPermute.remove(currentPermute.size() - 1);
        }
    }

    public static void main(String[] args) {
        String[] num = {"A","B","C"};
        List<List<String>> result = permute(num);

        for (List<String> newResult : result){
            System.out.println(newResult);
        }
    }
}
