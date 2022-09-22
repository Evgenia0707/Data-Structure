import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionStack {

    public static void main(String[] args) {
        //Most Deque implementations place no fixed limits on the number of elements they may contain,
        // but this interface supports capacity-restricted deque as well as those with no fixed size limit.

        //deque is used as a queue, FIFO (First-In-First-Out)

        Deque<Integer> cStack = new LinkedList<>();//double Linklist implementation
        cStack.push(1);
        cStack.push(2);
        cStack.push(3);

        System.out.println(cStack.peek());//3
        System.out.println(cStack.pop());//remove top on stack
        System.out.println("Peek is: " + cStack.peek());//2

        Stack<Integer> s = new Stack<>();

    }
}
