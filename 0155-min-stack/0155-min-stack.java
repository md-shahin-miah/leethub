class MinStack {

    private Stack<Integer> data;
    private Stack<Integer> mins;

    public MinStack() {
        data = new Stack<Integer>();
        mins = new Stack<Integer>();
    }
    public void push(int x) {
        data.push(x);
        if (mins.isEmpty()) {
            mins.push(x);
        }
        else {
            mins.push(Math.min(x, mins.peek()));
        }
    }
    public void pop() {
        data.pop();
        mins.pop();

    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return mins.peek();
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