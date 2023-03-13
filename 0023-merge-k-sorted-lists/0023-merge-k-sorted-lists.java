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
        if(lists.length==0)return null;
        return mergeKLists(lists, 0, lists.length-1);
    }
    
    public ListNode mergeKLists(ListNode[] lists, int l, int r){
        if(l>r)return null;
        
        if(l==r)
            return lists[l];
        
            int mid = l + (r-l)/2;
            ListNode l1 = mergeKLists(lists, l, mid);
            ListNode l2 = mergeKLists(lists, mid+1, r);
            return merge(l1, l2);
    } 
    
    public ListNode merge(ListNode l1, ListNode l2){
        if(l1==null || l2==null)return l1 != null ? l1 : l2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        temp.next = l1!=null ? l1 : l2;
        
        return dummy.next;
    }
}