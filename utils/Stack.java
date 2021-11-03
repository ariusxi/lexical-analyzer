package utils;

public class Stack<T> {
    
    private int stackPos;
    private T[] stack;

    public Stack(int size) {
        this.stackPos = -1;
        this.stack = (T[]) new Object[size];
    }

    public void push(T value) {
        if (this.stackPos < this.stack.length - 1) {
            this.stack[++stackPos] = value;
        }
    }

    public void empty() {
        this.stackPos = -1;
    }

    public T pop() {
        if (this.isEmpty()) {
            return null;
        }
        return this.stack[stackPos--];
    }

    public int length() {
        if (this.isEmpty()) {
            return 0;
        }
        return this.stackPos + 1;
    }

    public T head() {
        if (this.isEmpty()) {
            return null;
        }
        return this.stack[stackPos];
    }

    public boolean isEmpty() {
        return this.stackPos == -1;
    }

}
