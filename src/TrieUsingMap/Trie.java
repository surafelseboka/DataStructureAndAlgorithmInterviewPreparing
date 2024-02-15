package TrieUsingMap;

import java.util.HashMap;
import java.util.Map;

/*
            USING AN MAP
 */
public class Trie {

   private class TrieNode{
       Map<Character, TrieNode> children;
       boolean endOfWord;

       public TrieNode() {
           children = new HashMap<>();
           endOfWord = false;
       }
   }

   // Root value is not changed
    private final TrieNode root;

   public Trie() {
       root = new TrieNode();
   }
   /*
        Iterative way of inserting element into trie
    */

    public void insert(String word){
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null){
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        // Mark the current nodes endOfWords true
        current.endOfWord = true;
    }

    /*
            Recursive way of inserting elements to the tire
     */

    public void insertRecursive(String word){
        insertRecursive(root, word, 0);
    }

    private void insertRecursive (TrieNode current, String word, int index){
        if(index == word.length()){
            // If end of word is reached then mark endOfWord true on current node
            current.endOfWord = true;
            return;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);

        //If a node doesn't exist in the map create new map and put in
        if (node == null){
            node = new TrieNode();
            current.children.put(ch, node);
        }
        insertRecursive(node, word, index + 1);
    }

    /*
            Recursive implementation of searching from tries
     */

    public boolean searchRecursive(String word){
      return searchRecursive(root, word, 0);
    }

     private boolean searchRecursive(TrieNode current, String word, int index){

         if(index == word.length()){
             return current.endOfWord;
         }

         char ch = word.charAt(index);
         TrieNode node = current.children.get(ch);

         //If the node not found for the given the character then return false

         if (node == null){
             return false;
         }

         return searchRecursive(node, word, index +1);
     }
     /*
            Delete from tries
      */

    public boolean delete(String word){
       return  delete(root, word, 0);
    }

    private boolean delete(TrieNode current, String word, int index){

        if(index ==  word.length()){
            // When end of word reached only delete if current.endOfWords is true
            if (!current.endOfWord){
                return false;
            }
            current.endOfWord = false;
            // If current has no other mapping then return true
            return current.children.size() == 0;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);

        if (node == null){
            return false;
        }
        boolean shouldBeDeleteCurrentNode = delete(node, word, index + 1);

        //if true is returned then delete the mapping of character and trie node reference from map
        if (shouldBeDeleteCurrentNode){
            current.children.remove(ch);
            // return true if no mapping are left in the map
            return current.children.size()==0;
        }
        return false;
    }

}
