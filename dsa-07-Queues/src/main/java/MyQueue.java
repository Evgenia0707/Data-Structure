import java.util.NoSuchElementException;

public class MyQueue<T>{
    //have front (head), back
    QNode<T> front;
    QNode<T> back;
    int size;
    boolean isEmpty(){ return front == null;}
    T peek(){
        return (T) front.value;
    }
//Enqueue (add item)
    void enqueue(T item){
        QNode<T> node = new QNode<>(item);
        if (isEmpty()) front=back=node;
        else {//add after back - if not empty
            back.next=node;
            back=node;//update back
        }
        size++;
    }
//Dequeue (remove) - if rem from Q need send
    T dequeue(){//ret value of front
        QNode frontNode;//temp
        if (isEmpty()) throw new NoSuchElementException();
        //for only one element in queue
        if (front==back){
//            if (size==1)// same -if (front==back)
            frontNode=front;
            front=back=null;
        }else {//now I have more than one element
            frontNode=front;//new front
            front=front.next;//new node - second node
        }
        size--;
        return (T) frontNode.value;
    }
    int size(){return size;}
}
