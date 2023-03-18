class BrowserHistory {
    //try using stack again.
    class Node{
        Node prev;
        Node next;
        String url;
        Node(String url){
            prev = null;
            next = null;
            this.url = url;
        }
    }
        
    Node curr;

    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node temp = new Node(url);
        curr.next = temp;
        temp.prev = curr;
        curr = curr.next;
    }
    
    public String back(int steps) {
        while(curr.prev!=null && steps>0){
            curr = curr.prev;
            steps--;
        }
        
        return curr.url;
    }
    
    public String forward(int steps) {
        while(curr.next!=null && steps>0){
            curr = curr.next;
            steps--;
        }
        
        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */