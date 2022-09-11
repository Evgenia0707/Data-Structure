public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {//if empty - hear and tail null
        return head == null;
    }

    void add(int data) {
        //create new Node obj from data
        Node node = new Node(data);

        if (isEmpty()) {//if the List is empty
            head = tail = node; //assign head and tail to node -data in the List
            size++;//increase size
        } else {//if there are elements in the List
            tail.next = node;
            tail = node;
            size++;
        }
    }
//will delete id what was sent

    void deleteById(int id) {
//check if empty
        if (isEmpty()) System.out.println("List is empty!!!");

//assign prev and current with the Head (start from head) temporary assign-start from beginning
        Node prev = head;
        Node current = head;

//start from beginning
        while (current != null) {
            if (current.id == id) {//if their in the match with wat we rec

//case 1: Head
                if (current == head) {
                    head = current.next;//assign whit current item
                    current.next = null;
                }
//case 2: tail
                else if (current == tail) {
                    tail = prev;// my new tail - assign prev tail
                    prev.next = null;//Ex - Tail will be eligible for Garbage Collection
                }

//case 3: middle
                else {
                    prev.next = current.next;
                    current.next = null;//Current will be eligible for Garbage Collection
                }
//after deletion if succeed
                size--;

            }
//move forward on the elements of the list until count to end (tail)
//IMPORTANT - assign prev value to current

            prev = current;//keep prev value - don't need to lost it
            current = current.next;
        }

    }

    int indexOf(int id) {
        if (isEmpty()) return -1;
        int pos = 0;//defain position - set to 0
        //iterate through the list
        Node current = head;// set my current with the starting element
        while (current != null) {
            if (current.id == id) return pos;//curr id == id sent if the case return position
            pos++;
            current = current.next;//move to next elem
        }
        return -1;//if not find elem
    }

     void printNodes() {
        Node current = head;
        while (current != null) {//not equal print my node

            if (current.next == null) System.out.println(current.id + " => null");//if last element -> null - say null
            else {
                System.out.print(current.id + "=>");//if not last elem
            }
            current = current.next;//complete when Node is null
        }
    }

}
