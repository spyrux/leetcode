/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        if(head == null ||head.next == null){
            return head;
        }
        
        ListNode mid = getMid(head);
        ListNode right = sortList(mid);
        ListNode left = sortList(head);
        return merge(left, right);
        
        
    }
    
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode sent = new ListNode();
        ListNode pointer = sent;

        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                pointer.next = l2;
                l2 = l2.next;
            }else{
                pointer.next = l1;
                l1 = l1.next;
            }
            
            pointer = pointer.next;
        }
        if(l1 != null){
            pointer.next = l1;
        }else{
            pointer.next = l2;
        }
              
        return sent.next;
        
        
        
    }
    
    public ListNode getMid(ListNode node){
        
        ListNode midPrev = null;
        
        while(node!= null && node.next!= null){
            midPrev = (midPrev == null)? node: midPrev.next;
            node = node.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}