package PriorityQueue.BasicImpl;

  class Task implements Comparable<Task> {

      String description;
      int priority;

      public Task(String description, int priority){
          this.description = description;
          this.priority = priority;
      }

      @Override
      public int compareTo(Task other) {
          return Integer.compare(this.priority, other.priority);
      }
  }
