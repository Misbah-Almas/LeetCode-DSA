/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        if(head1==null || head2==null) return null;
        ListNode l1 = head1;
        ListNode l2 = head2;
        while(l1 != l2){ // loop ends either intersection is found or when l1 = l2 = null
            if(l1==null)
                l1 = head2;
            else l1 = l1.next;
            
            if(l2==null)
                l2 = head1;
            else l2 = l2.next;
        }
        
        return l1;
    }
}