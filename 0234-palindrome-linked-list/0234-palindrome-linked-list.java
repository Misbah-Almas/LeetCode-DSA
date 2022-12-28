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
        if(head.next==null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            if(fast != null){
                slow = slow.next;
            }
        }
        ListNode head2 = reverse(slow.next);
        slow.next = null;
        ListNode h1 = head;
        ListNode h2 = head2;
        while(h2 != null && h1 != null){
            if(h1.val != h2.val) return false;
            h1 = h1.next;
            h2 = h2.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = head;
        while(curr != null){
            temp = temp.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}