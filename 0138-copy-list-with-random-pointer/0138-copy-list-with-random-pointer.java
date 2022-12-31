/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        Node temp = head;
        while(temp != null){
            Node forw = temp.next;
            temp.next = new Node(temp.val);
            temp.next.next = forw;
            temp = forw;
        }
        temp = head;
        while(temp != null){
            if(temp.next != null){
                temp.next.random = temp.random != null ? temp.random.next : null;
                temp = temp.next.next;
            }
        }
        Node copyHead = head.next;
        temp = head;
        Node cTemp = head.next;
        while(temp != null){
            temp.next = temp.next.next;
            if(cTemp.next != null){
            cTemp.next = cTemp.next.next;
            }
            temp = temp.next;
            cTemp = cTemp.next;
        }
        return copyHead;
    }
}