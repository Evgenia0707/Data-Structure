import java.util.NoSuchElementException;

public class MyStack<T> {

    public SNode<T> bottom;//head
    public SNode<T> top;//tail
    int size;

    public boolean isEmpty() {
        return bottom == null;//if equal
    }

    public void push(T item) {//put item of T type
        SNode<T> node = new SNode<>(item); //create new Node
        if (isEmpty()) bottom = top = node;
        else {//add itep to top node
            top.next = node;
            top = node;
        }
        size++;
    }

    public T peek() {//not remove top - return value of top
        return (T) top.value;//cast into (T)
    }

    public T pop() {//remove
        SNode peekNode;//define
//if list empty
        if (isEmpty()) throw new NoSuchElementException();
//if not empty - 1 item in list -- more than 1 item in the list
//stack has one element
        if (top == bottom) { //only 1 item assign top and bottom with null value - delete
            peekNode = top;
            top = bottom = null;
        } else {//more than one element - remove in the top
            peekNode = top;//find the node the top
            SNode prev = bottom;//find prev nod on the top
            while (prev.next != top) {
                prev = prev.next;
            }
            prev.next = null;
            top = prev;//assign top to prev
        }
        size--;
        return (T) peekNode.value;// cast T
    }

}
