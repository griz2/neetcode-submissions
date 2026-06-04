class MinStack {

    Stack<Integer> stack;
    Stack<Integer> mins;

    public MinStack() {
        stack = new Stack<>();
        mins = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (mins.isEmpty() || val<=mins.peek()) {
            mins.push(val);
        }
    }
    
    public void pop() {
        if (stack.peek().equals(mins.peek())){
            mins.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
