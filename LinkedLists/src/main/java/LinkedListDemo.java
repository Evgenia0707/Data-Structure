import java.util.ArrayList;

public class LinkedListDemo {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        //point to next - link node
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;


        System.out.println("Node1's address is: " + node1 + " Node1' next address is " + node1.next);//Node@38082d64 Node1' next address is com.company.linkedLists.Node@dfd3711
        System.out.println("Node2's address is: " + node2 + " Node2' next address is " + node2.next);//
        System.out.println("Node3's address is: " + node3 + " Node3' next address is " + node3.next);//
        System.out.println("Node4's address is: " + node4 + " Node4' next address is " + node4.next);//Node@26ba2a48 Node4' next address is null


//iterate list
        Node current;
        Node head = node1;//variable head

        current = head;
        while (current != null) {
            System.out.println("Id of node is: " + current.id);//id value of Node
            current = current.next;
        }
        ArrayList<Node> nodeArrayList = new ArrayList<>();
//        nodeArrayList.add()


        System.out.println(node1.next.id + " Id of the second node");

        System.out.println("Next address is: " + node1.next);//Next address is: Node@dfd3711

    }
}
