import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {

    public static void main(String[] args) {
//create hash map
        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");

        System.out.println(findFirstNonRepeating("JavvaJDeveloper"));//D

    }

    public static Character findFirstNonRepeating(String str) {
        //create a Map ;  this will cost me space complexity O(n)
        Map<Character, Integer> map = new TreeMap<>();//<char , count>
        int count;//frequency char

        //count the frequency of chars
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) { //if current char not in the list - put count 1 //if exist - incise by one and put again in Map
                count = map.get(ch);
                map.put(ch, count + 1);

            } //if no character in map - mean 1 time put in Map
            else map.put(ch,1);
        }

        //start from thr beginning and check if there is a char with frequency 1
        for (Character ch : str.toCharArray()){
            if (map.get(ch) ==1) return ch;//no character(only one)
        }
        return null;//if no non-repeating character
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