class MyStack {
    Queue<Integer> qu;
    public MyStack() {
        qu = new LinkedList<>();
    }
    
    public void push(int x) {
        qu.offer(x);
        int size = qu.size();
        while(size>1){
            qu.offer(qu.poll());
            size--;
        }
    }
    
    public int pop() {
       return qu.poll();
    }
    
    public int top() {
        return qu.peek();
        
    }
    
    public boolean empty() {
        return qu.isEmpty();
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