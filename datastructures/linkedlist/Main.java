package datastructures.linkedlist;

public class Main {
    
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        node1.setNext(node2);
        node2.setNext(node3);

        for (Node node = node1; node!=null; node = node.getNext()) {
            System.out.println(node.getVal());
        }
    }
}
