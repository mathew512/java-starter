package io.github.mathew512.Exercise.java_se_018;

public class Stack<T> {
    private java.util.LinkedList<T> list = new java.util.LinkedList<>();

    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return list.removeFirst();
    }

    public T peek() {
        if (list.isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

