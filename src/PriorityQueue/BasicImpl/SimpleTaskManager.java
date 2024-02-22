package PriorityQueue.BasicImpl;

import java.util.PriorityQueue;

public class SimpleTaskManager {
    public static void main(String[] args) {

        // Create a priority queue
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.add(new Task("Buy Groceries", 3));
        tasks.add(new Task("Finish homework", 2));
        tasks.add(new Task("Go to gym", 4));
        tasks.add(new Task("Clean the house", 1));

        while (!tasks.isEmpty()){
            Task currentTask = tasks.poll();
            System.out.println("Processing Task : " + currentTask.description
                    + " (priority: " + currentTask.priority + ")" );
        }
        System.out.println("All task completed!");
    }
}
