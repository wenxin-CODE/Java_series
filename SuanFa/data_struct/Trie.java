package data_struct;

public class Trie {
    public static void main(String[] args) {
        Tries ss = new Tries();
        ss.insert("apple");
        System.out.println(ss.searchPrefix("app").toString());
    }

}

class Tries{
    private Tries[] children;
    private boolean isEnd;

    public Tries(){
        children = new Tries[26];
        isEnd = false;
    }

    public void insert(String word){
        Tries node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if(node.children[index] == null){
                node.children[index] = new Tries();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public Tries searchPrefix(String prefix){
        Tries node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            if(node.children[index] == null){
                return null;
            }
            node = node.children[index];
        }
        return node;
    }

    public boolean search(String word){
        Tries node = searchPrefix(word);
        return node != null&&node.isEnd;
    }

    public boolean startsWith(String prefix){
        return searchPrefix(prefix) != null;
    }
}
