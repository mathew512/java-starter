package io.github.mathew512.Exercise.java_se_018;

public class DataStructureDemo {
    public static void main(String[] args) {
        // Stack with Strings
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Stack: " + stringStack);
        System.out.println("Pop: " + stringStack.pop());

        // Queue with Integers
        Queue<Integer> intQueue = new Queue<>();
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        System.out.println("Queue: " + intQueue);
        System.out.println("Dequeue: " + intQueue.dequeue());

        // TreeNode with custom object
        TreeNode<String> root = new TreeNode<>("Root");
        root.setLeft(new TreeNode<>("Left"));
        root.setRight(new TreeNode<>("Right"));
        System.out.println("Tree Root: " + root);
        System.out.println("Left Child: " + root.getLeft());
        System.out.println("Right Child: " + root.getRight());
    }
}

