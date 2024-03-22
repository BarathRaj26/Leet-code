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
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null)
            return true;
        
        ListNode prevSlow = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next !=null)
        {
            fast = fast.next.next;                               
            
            ListNode nextSlow = slow.next;                        
            slow.next = prevSlow;                               
            prevSlow = slow;                                       
            slow = nextSlow;                                    
        }
        
        if(fast!=null)
       {                                            
            slow = slow.next;                                  
        }

        while(prevSlow!=null && slow!=null)
       {
            if(prevSlow.val != slow.val){
                return false;
            }
            prevSlow = prevSlow.next;
            slow = slow.next;
        }
        
        return true;
    }
}