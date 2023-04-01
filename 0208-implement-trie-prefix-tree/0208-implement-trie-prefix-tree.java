class TrieNode {
    
    private TrieNode[] links;
    private final int R = 26;
    boolean isEnd;
    
    public TrieNode() {
        
        links = new TrieNode[R];
        
    }
    
    public boolean containsKey(char ch) {
        return links[ch-'a'] != null;
    }
    
    public TrieNode get(char ch){
        return links[ch -'a'];
    }
    
    public void put(char ch, TrieNode node){
        links[ch-'a'] = node; 
    }
    
    public void setEnd(){
        isEnd = true;
    }
    
    public boolean isEnd(){
        return isEnd;
    }
}


class Trie {
    
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
        
    }
    
    
    public void insert(String word) {
        
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            
            char currentChar = word.charAt(i);
            
            if(curr.containsKey(currentChar)){
                curr = curr.get(currentChar);
            }else{
                TrieNode next = new TrieNode();
                curr.put(word.charAt(i), next);
                curr = next;
            }
        }
        
        curr.setEnd();
        
        
       
    }
    
    public boolean search(String word) {
        
        TrieNode curr = root;
        
        
        for(int i = 0; i < word.length(); i++){
            char curLetter = word.charAt(i);
            
           
            if(curr.containsKey(curLetter)){
                  curr = curr.get(word.charAt(i));
            }else return false;
            
        }
        
        
        return curr.isEnd();
        
     }
        
    
    
    public boolean startsWith(String prefix) {
        
        TrieNode curr = root;
        
        for(int i = 0; i < prefix.length(); i++){
            if(curr.containsKey(prefix.charAt(i))){
                curr = curr.get(prefix.charAt(i));
            }else return false;
        }
        
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */