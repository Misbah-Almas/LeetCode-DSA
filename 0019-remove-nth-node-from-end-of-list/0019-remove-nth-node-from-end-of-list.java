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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int s = 0;
        ListNode temp = head;
        while(temp != null){
            s++;
            temp = temp.next;
        }
        if(s==n){
            head = head.next;
            return head;
        }
        temp = head;
        int t = s-n;
        while(t-->1){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}