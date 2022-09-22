public class ExprBalanceCheck {
    public static void main(String[] args) {

        System.out.println(balanceCheck("(A*C) + {V-M}"));//true
        System.out.println(balanceCheck("(A*C) + {V-M})"));//false
        System.out.println(balanceCheck("(A*C) + ({V-M})"));//true

    }

    public static boolean balanceCheck(String expr) {
//create a stack
        MyStack<Character> myStack = new MyStack<>();

//iterate over expr
        for (int i = 0; i < expr.length(); i++) {
            Character ch = expr.charAt(i);

//filter non player chars (A,B,+.-....)
            if (ch != '(' && ch != '[' && ch != '{' && ch != ')' && ch != ']' && ch != '}') continue;//if not return false

//if it is a symbol to be processed
//if opening symbol push it to the stack -
            if (ch == '(' || ch == '[' || ch == '{') {
                myStack.push(ch);
                continue;
            }
//at this point this is a closing symbol
//stack shouldn't be empty (like open ([{ )
            if (myStack.isEmpty()) return false;
//use switch
            switch (ch) {// if match - continue - go to next symbol
                case ')':  //if not match top on the stack return false
                    if (myStack.pop() != '(') return false;
                    break;
                case ']':
                    if (myStack.pop() != '[') return false;
                    break;
                case '}':
                    if (myStack.pop() != '{') return false;
                    break;
            }
        }//end of for

        //return if stack is empty (all symbols match - open and close)- if not -return false
        return myStack.isEmpty();
    }
}
