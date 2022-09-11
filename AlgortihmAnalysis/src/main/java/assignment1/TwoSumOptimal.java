package assignment1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimal {
    public static void main(String[] args) {

        int[] array=new int[]{2,7,9,11};

        System.out.println(Arrays.toString(twoSumOptimalSolution(array,9)));//[1, 0]

    }

    public static int[] twoSumOptimalSolution(int[] array, int targetValue) {

        //Complexity of the solution id O(n) but I have space complexity of O(n)

//create hashMap

        Map<Integer, Integer> map = new HashMap<>();
//combine 2 integration to 1
        for (int i = 0; i < array.length; i++) {
          int potentialMatch = targetValue - array[i]; //calculate match
            if (map.containsKey(potentialMatch)) return new int[]{i, map.get(potentialMatch)}; //if find return match
            else map.put(array[i] , i);
        }
        return new int[]{};//if no match return empty
    }
}