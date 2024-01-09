//package HashMap;
//
//
//// unfinished
//import LinkedList.Implmentation.LinkedList;
//
//public class MyHashMap {
//     private static final int DEFAULT_CAPACITY = 16;
//     private LinkedList<Entry>[] buckets;
//
//     private static class Entry {
//         int key;
//         int value;
//
//         Entry(int key, int value){
//             this.key = key;
//             this.value= value;
//         }
//     }
//
//     public MyHashMap() {
//
//         buckets  = new LinkedList[DEFAULT_CAPACITY];
//         for (int i = 0; i <DEFAULT_CAPACITY; i++) {
//                buckets[i] = new LinkedList();
//         }
//         }
//
//    public void put(int key, int value) {
//        int hash = hash(key);
//        LinkedList<Entry> bucket = buckets[hash];
//
//        // Check if the key already exists in the bucket and update its value
//        for (Entry entry : bucket) {
//            if (entry.key == key) {
//                entry.value = value;
//                return;
//            }
//        }
//
//        // Key not found, add a new entry to the bucket
//        bucket.add(new Entry(key, value));
//    }
//
//    public int get(int key) {
//        int hash = hash(key);
//        LinkedList<Entry> bucket = buckets[hash];
//
//        // Search for the key in the bucket
//        for (Entry entry : bucket) {
//            if (entry.key == key) {
//                return entry.value;
//            }
//        }
//
//        // Key not found
//        return -1;
//    }
//
//    public void remove(int key) {
//        int hash = hash(key);
//        LinkedList<Entry> bucket = buckets[hash];
//
//        // Search for the key in the bucket and remove it
//        for (Entry entry : bucket) {
//            if (entry.key == key) {
//                bucket.remove(entry);
//                return;
//            }
//        }
//    }
//
//    private int hash(int key) {
//        // Simple hash function for demonstration purposes
//        return key % DEFAULT_CAPACITY;
//    }
//
//
//}
