package TrieUsingArray;

class Trie {

       TrieNode root;

       public Trie(){
           root = new TrieNode();
       }

       public void insert(String word){
           root.insert(word, 0);
       }
       public boolean search(String word){
           return root.search(word, 0);
       }

       public boolean startsWith(String prefix){
           return root.startsWith(prefix, 0);
       }

    class TrieNode {
        TrieNode[] children;
        boolean endOfWord;

        TrieNode(){
            children = new TrieNode[26];
        }

        // using a recursive way
        public void insert(String word, int index){

            if(index >= word.length()) return;
            int i = word.charAt(index) - 'a';
            if (children[i] == null) {
                children[i] = new TrieNode();
            }

            if (index == word.length() -1){
               children[i].endOfWord = true;
            }
            children[i].insert(word, index + 1);
        }

        // using a recursive way
        public boolean search ( String word, int index){
            if (index >= word.length()) return false;
            TrieNode node = children[word.charAt(index) - 'a'];
            if(node == null) return false;
            if (index == word.length() - 1 && node.endOfWord) return true;

            return node.search(word, index + 1);
        }

        // Using a recursive way of finding a prefix values
        public  boolean startsWith(String prefix, int index){
            if (index >= prefix.length()) return false;
            TrieNode node = children[prefix.charAt(index) - 'a'];
            if (node == null) return false;
            if (index == prefix.length() - 1) return true;

            return node.startsWith(prefix, index + 1);
        }
    }

        public static void main(String[] args) {

            Trie trie = new Trie();
            trie.insert("apple");
            System.out.println(trie.search("apple"));
            System.out.println(trie.search("app"));
            System.out.println(trie.startsWith("app"));

    }

}
