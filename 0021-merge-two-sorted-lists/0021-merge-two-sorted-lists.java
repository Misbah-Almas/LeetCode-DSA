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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        
    if (head1==null)
               return  head2;
        if(head2==null){
                return head1;
        }

        ListNode newHead = null;
        ListNode temp = null;
        if(head1.val<head2.val){
                        newHead = head1;
                        temp = head1;
                        head1 = head1.next;
                }else{
                        newHead = head2;
                        temp = head2;
                        head2 = head2.next;
                }
        while(head1 != null && head2 != null){
                if(head1.val<head2.val){
                        temp.next = head1;
                        temp = temp.next;
                        head1 = head1.next;
                }else{
                        temp.next = head2;
                        temp = temp.next;
                        head2 = head2.next;
                }
        }
        if(head1!=null)
                temp.next = head1;
        else if(head2 != null)
                temp.next = head2;
        return newHead;
        
    }
}