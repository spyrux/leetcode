/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        List<Node> nodeList1 = new ArrayList<>();
        List<Node> nodeList2 = new ArrayList<>();
        Node l2 = new Node(-1);
        Node prev = l2;
        Node curr = head;
        while(curr != null){
            nodeList1.add(curr);
            Node copy = new Node(curr.val);
            prev.next = copy;
            nodeList2.add(prev.next);
            prev = prev.next;
            curr = curr.next;
        }
        nodeList1.add(null);
        nodeList2.add(null);
        prev.next = nodeList2.get(nodeList2.size()-1);
        
        for(int i = 0; i < nodeList2.size() - 1; i++){
            Node n1 = nodeList1.get(i);
            int r1ind;
            if(n1.random == null){
                r1ind = nodeList1.size() - 1;
            }else{
                r1ind = nodeList1.indexOf(n1.random);
            }
            Node n2 = nodeList2.get(i);
            System.out.println(n2.val);
            n2.random = nodeList2.get(r1ind);
         
        }
        
        
        return l2.next;
    }
}