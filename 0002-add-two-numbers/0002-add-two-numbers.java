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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        ListNode sum = new ListNode();
        ListNode pointer = sum;
        ListNode p1 = l1;
        ListNode p2 = l2;
        
        
        int length1 = 1;
        int length2 = 1;
        
        while(p1.next!= null){
            length1++;
            p1 = p1.next;
        }
        
        while(p2.next!= null){
            length2++;
            p2 = p2.next;
        }
        
        p1 = l1;
        p2 = l2;
                
        

        
        if(length1 == length2){
            
            while(p2.next != null && p1.next != null){
                ListNode curr = new ListNode();
                curr.val = p2.val+p1.val;
                p1 = p1.next;
                p2 = p2.next;
                pointer.next = curr;
                pointer = pointer.next;
            }
            
            ListNode curr = new ListNode();
            curr.val = p1.val+p2.val;
            pointer.next = curr;
            
            
        }else if(length1 > length2){
            
            while(p2.next != null && p1.next != null){
                ListNode curr = new ListNode();
                curr.val = p2.val+p1.val;
                p1 = p1.next;
                p2 = p2.next;
                pointer.next = curr;
                pointer = pointer.next;
            }
            
            ListNode abc = new ListNode();
            abc.val = p1.val+p2.val;
            pointer.next = abc;
            p1 = p1.next;
            pointer = pointer.next;
            
            while(p1.next!= null){
                ListNode curr = new ListNode();
                curr.val = p1.val;
                p1 = p1.next;
                pointer.next = curr;
                pointer = pointer.next;
            }
            
            ListNode curr = new ListNode();
            curr.val = p1.val;
            pointer.next = curr;
            pointer = pointer.next;
            
            
        }else{
            
            while(p2.next != null && p1.next != null){
                ListNode curr = new ListNode();
                curr.val = p2.val+p1.val;
                p1 = p1.next;
                p2 = p2.next;
                pointer.next = curr;
                pointer = pointer.next;
            } 
            
            ListNode abc = new ListNode();
            abc.val = p1.val+p2.val;
            pointer.next = abc;
            p2 = p2.next;
            pointer = pointer.next;
            
            while(p2.next!= null){
                ListNode curr = new ListNode();
                curr.val = p2.val;
                p2 = p2.next;
                pointer.next = curr;
                pointer = pointer.next;
            }
            
            ListNode curr = new ListNode();
            curr.val = p2.val;
            pointer.next = curr;
            pointer = pointer.next;
            
        }
        
        pointer = sum.next;
        boolean carry = false;
        while(pointer !=null || carry){
            if(carry){
                pointer.val++;
                carry = false;
            }
            if(pointer.val >= 10){
                carry = true;
                pointer.val = pointer.val%10;
            }
            
            if(pointer.next == null && carry){
                pointer.next = new ListNode(1);
                carry = false;
            }
            pointer = pointer.next;
        }
        
        
        return sum.next;
        
    }
}