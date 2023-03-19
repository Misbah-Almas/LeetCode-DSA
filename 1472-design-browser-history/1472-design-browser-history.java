class BrowserHistory {
    
    Stack<String> forHis;
    Stack<String> bacHis;
    
    public BrowserHistory(String homepage) {
        forHis = new Stack<>();
        bacHis = new Stack<>();
        bacHis.push(homepage);
    }
    
    public void visit(String url) {
        forHis.clear();
        bacHis.push(url);
    }
    
    public String back(int steps) {
        while(bacHis.size()>1 && steps-->0){
            forHis.push(bacHis.pop());
        }
        return bacHis.peek();
    }
    
    public String forward(int steps) {
        while((!forHis.empty() && steps-->0)){
            bacHis.push(forHis.pop());
        }
        return bacHis.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */