/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    
    Map<Node, Node> visited;
    
    
    public Node cloneGraph(Node node) {
        
        if(node == null){
            return null;
        }
        
        visited = new HashMap<>();
        
        Node start = new Node();
        
        dfs(visited, node, start);
        
        
        
        return start;
        
        
    }
    
    
    public void dfs(Map<Node, Node> visited, Node node, Node clone){
        
        if(node == null){
            return;
        }
        
        visited.put(node, clone);
        
        clone.val = node.val;
        
        for(Node neighbor: node.neighbors){
            if(!visited.containsKey(neighbor)){
                Node next = new Node();
                clone.neighbors.add(next);
                dfs(visited, neighbor, next);
            }else{
                clone.neighbors.add(visited.get(neighbor));
            }
        }
        
        
    }
    
    
    
    
    
}