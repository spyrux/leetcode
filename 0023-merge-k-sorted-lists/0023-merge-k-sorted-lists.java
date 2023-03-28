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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        ListNode cur = ans;
        
        
        Queue<ListNode> minHeap = new PriorityQueue<>((a,b)->a.val - b.val);
        for(int i = 0; i < lists.length; i++){
            if(lists[i] == null) continue;
            minHeap.add(lists[i]);
        }
        
        while(!minHeap.isEmpty()){
            
            ListNode list = minHeap.poll();
            
            if(ans == null){
                ans = list;
                cur = ans;
    
            }else{
                cur.next = list;
                cur = cur.next;
            }
            
            
            if(list.next!=null){
                minHeap.add(list.next);
            }
            
            
            
        }
        
        return ans;
        
    }
}