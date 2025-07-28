class MinStack {
    private Stack <Integer> min;
    private Stack <Integer> sta;

    public MinStack() {
        sta = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if (sta.size()==0 || min.peek() >= val) {
            min.push(val);
        } 
        sta.push(val);
    }
    
    public void pop() {
        int i  = sta.pop();
        int j = min.peek();

        if(i==j){
            min.pop();
        }
    }
    
    public int top() {
        return sta.peek();
    }
    
    public int getMin() {
        return min.peek();        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */