class MyQueue {
    private Stack<Integer> main;
    private Stack<Integer> sub;

    public MyQueue() {
        main = new Stack<>();
        sub = new Stack<>();    
    }
    
    public void push(int x) {
            while(main.size() > 0){
                sub.push(main.pop());
            }
            main.push(x);
            while(sub.size() > 0){
                main.push(sub.pop());
            }
    }
    
    public int pop() {
        return main.pop();
    }
    
    public int peek() {
        return main.peek();
    }
    
    public boolean empty() {
        return (main.size() == 0);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */