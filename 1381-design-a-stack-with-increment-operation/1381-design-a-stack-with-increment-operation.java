class CustomStack {

    private int[] stack;
    private int startPointer;
    
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        startPointer = maxSize - 1;
    }
    
    public void push(int x) {
        if (startPointer >= 0) {
            stack[startPointer] = x;
            startPointer--;
        }
    }
    
    public int pop() {
        if (startPointer >= stack.length - 1) return -1;
        int cur = startPointer + 1;
        int top = stack[cur];
        stack[cur] = 0;
        startPointer++;
        return top;
        
    }
    
    public void increment(int k, int val) {
        int i = stack.length - 1;

        while (i >= 0 && k > 0) {
            stack[i] += val;
            i--;
            k--;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */