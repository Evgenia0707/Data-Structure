import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {

        //1. create a set
        Set<Student> set = new LinkedHashSet<>();

        // 2 add element

        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Julia"));
        set.add(new Student(4, "Mary"));
        set.add(new Student(3, "Mike"));
//        System.out.println(set.add(new Student(4, "Mary")));//false

        System.out.println(set);//print all

//need override equals and hashcode for correct work
        System.out.println(firstRepeatingChar("Javva Developer"));//v

    }

    public static Character firstRepeatingChar(String str) {
        //What is the time complexity of the following code? O(n)

        //create a hashSet
        Set<Character> chars = new HashSet<>();//in here I have Space Complexity of O(n)
        // (additional space) create another data structure and fill with data

        //iterate over the char array and add chars into hashSet
        for (Character ch : str.toCharArray()) //time complexity - more important
            if ( !chars.add(ch))//if false
                return ch;//char what have inside

                //if add ops is false return that char

        return null;

    }
}
/*
Algorithm Problem (First Non-Repeating Char in a String)

Find the first non-repeating char in a string.
Example:
String=“Java Developer”
Output:
J
 */