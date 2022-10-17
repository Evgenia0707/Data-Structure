import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class CollectionsQueue {
    public static void main(String[] args) {

//FIFO
        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueue(1);//add
        mq.enqueue(2);

        System.out.println(mq.dequeue());//1  //remove
        System.out.println(mq.dequeue());//2

        Queue<Integer> cq = new LinkedList<>();//collection queue
        cq.add(1);
        cq.add(3);

        System.out.println(cq.remove());//1
        System.out.println(cq.remove());//3

        HashMap<Integer, String> hnp = new HashMap<>();//for read info about HashMap
        TreeMap<Integer, String> tmp = new TreeMap<>();//for read info about TreeMap

    }
}
