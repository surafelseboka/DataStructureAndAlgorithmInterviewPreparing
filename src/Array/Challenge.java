package Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

record GroceryList( String name){
    public GroceryList(String name){
        this.name = name;
    }
}

public class Challenge {
   ArrayList<GroceryList> list = new ArrayList<>();

   public void addLists(String items){
       list.add(new GroceryList(items));
   }

   public void removeLists(String items){
       list.remove(new GroceryList(items));
   }

   public boolean isContain(String item){
      return list.contains(new GroceryList(item));
   }

   public void printSortedListed(){
       out.println(list);
}

class ChallengeMain{
    public static void main(String[] args) {


        out.println("Available actions:");
        out.println("0 - to shutdown");
        out.println("1- to add item(s) to list (comma delimited list");
        out.println("2- to remove any items (comma delimited list)");
        out.print("Enter the number for which actions you want to do: ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 0){
            return;
        } else if (input == 1) {

        }

    }
}}
