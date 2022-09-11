public class Node {
    int id;
    //define address to next element - point to other class node
    Node next;//refer to other element

    public Node(int id) {
        this.id = id;
    }

    public Node(Node next) {
        this.next = next;
    }
}
