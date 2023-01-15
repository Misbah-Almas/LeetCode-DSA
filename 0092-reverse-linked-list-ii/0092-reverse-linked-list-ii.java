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

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == 1 && n == 1) return head;
        int t = m;
        ListNode temp1 = head, temp2 = head, temp3 = head;
        while (n > 1) {
            if (m > 2) {
                temp1 = temp1.next;
                m--;
            }
            temp2 = temp2.next;
            n--;
        }
        temp3 = temp2.next;
        temp2.next = null;
        if (t > 1) {
            temp2 = temp1.next;
            temp1.next = reverse(temp1.next);
            temp2.next = temp3;
        } else {
            head = reverse(temp1);
            temp1.next = temp3;
        }

        return head;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head, temp = head;
        while (curr != null) {
            temp = temp.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
