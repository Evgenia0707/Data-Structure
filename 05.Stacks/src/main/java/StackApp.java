public class StackApp {
    public static void main(String[] args) {

//for implement stack
        MyStack<Integer> stack = new MyStack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
//        System.out.println(stack.peek());//return value of top 4
//        System.out.println(stack.pop());//return top value4

        stack.push(10);

        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());//start from last 10 4 4 3 2 1 0
        }
        System.out.println(stack.peek());//10 4 4 3 2 1 0
    }

}
