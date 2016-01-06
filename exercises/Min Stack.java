 Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.


class MinStack {
    
     Stack<Integer> topStack = new Stack<Integer>();
     Stack<Integer> minStack = new Stack<Integer>();
     
    public void push(int x) {
        topStack.push(x);
        if (minStack.empty()) {
            minStack.push(x);
        }else if (minStack.peek() >= x) {
            minStack.push(x);
        }
    }

    public void pop() {
        int poppedElement = topStack.pop();
        if (poppedElement == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return topStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}