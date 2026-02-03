package io.github.mathew512.Exercise.java_se_018;

public class Queue<T> {
    private java.util.LinkedList<T> list = new java.util.LinkedList<>();

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("Queue is empty");
        }
        return list.removeFirst();
    }

    public T peek() {
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("Queue is empty");
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
