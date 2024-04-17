package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceryList = new ArrayList<>();
        while (flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(groceryList);
                default -> flag = false;
            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList);
        }
    }

    private static  void addItems(ArrayList<String> groceries){
        System.out.println("add item(s) to list (comma delimited list");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));
        for (String i: items){
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0){
                groceries.add(trimmed);
            }
        }
    }
    private static void printActions() {
        String textBlock = """
                
                         Available actions: 
                         0 - to shutdown 
                         1- to add item(s) to list (comma delimited list 
                         2- to remove any items (comma delimited list: 
                         Enter the number for which actions you want to do: 
                """;
        System.out.println(textBlock + "");

    }
}
