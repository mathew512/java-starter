package io.github.mathew512.Exercise.java_se_018;

public class TreeNode<T> {
    private T value;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T value) {
        this.value = value;
    }

    public T getValue() { return value; }
    public TreeNode<T> getLeft() { return left; }
    public TreeNode<T> getRight() { return right; }

    public void setLeft(TreeNode<T> left) { this.left = left; }
    public void setRight(TreeNode<T> right) { this.right = right; }

    @Override
    public String toString() {
        return "Node(" + value + ")";
    }
}
