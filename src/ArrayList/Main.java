package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    GroceryItem(String name){
        this(name, "DIARY", 1);
    }
}
public class Main {
    public static void main(String[] args) {

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Cheese"));
        groceryList.add(new GroceryItem("Eggs"));
        groceryList.set(1, new GroceryItem("Irish butter"));

        System.out.println(groceryList);
    }
}
