package datastructures.linkedlist;

public class Node {

    private int val;
    private Node next;

    public Node() {
        this.val = 0;
        next = null;
    }

    public Node(int val) {
        this.val = val;
        next = null;
    }

    public Node(int val, Node nextNode) {
        this.val = val;
        next = nextNode;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }

    public Node getNext() {
        return this.next;
    }

    public void setval(int val) {
        this.val = val;
    }

    public int getVal() {
        return this.val;
    }
}
