class MyStack {
/*
Queue 1 - [20] 
Queue 2 - []

*/
    private Queue<Integer> main;
    private Queue<Integer> sub;

    public MyStack() {
        main = new LinkedList<>();
        sub = new LinkedList<>();
    }
    
    public void push(int x) {
        while(main.size()>0){
            sub.add(main.remove());
            }
        main.add(x);

        while(sub.size() > 0){
            main.add(sub.remove());
        }
    }
    
    public int pop() {
        return main.remove();
    }
    
    public int top() {
        return main.peek();
    }
    
    public boolean empty() {

        return (main.size() == 0);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */