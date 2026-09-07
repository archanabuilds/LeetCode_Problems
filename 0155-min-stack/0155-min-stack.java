import java.util.ArrayDeque;
class MinStack {
    ArrayDeque<Integer> st;
    ArrayDeque<Integer> mnSt;

    public MinStack() {
        st = new ArrayDeque<>();
        mnSt = new ArrayDeque<>();
    }

    public void push(int value) {

        // Insert into original stack
        st.push(value);

        // Insert into min stack
        if (mnSt.isEmpty()) {
            mnSt.push(value);
        } else {
            mnSt.push(Math.min(value, mnSt.peek()));
        }
    }

    public void pop() {
        st.pop();
        mnSt.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return mnSt.peek();
    }
}