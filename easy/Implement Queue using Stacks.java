class MyQueue {
    
    Stack<Integer> push = new Stack<Integer>();
    Stack<Integer> pop = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        push.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (!pop.empty()) {
            pop.pop();
            return;
        }

        while (!push.empty()) {
            pop.push(push.pop());
        }

        pop.pop();
    }

    // Get the front element.
    public int peek() {
        if (!pop.empty()) {
            return pop.peek();
        }

        while (!push.empty()) {
            pop.push(push.pop());
        }

        return pop.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return push.empty() && pop.empty();
    }
}