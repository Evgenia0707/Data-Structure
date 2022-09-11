package assignment1;

import java.util.Arrays;

public class TwoSumInSortedArr {

    public static void main(String[] args) {


        int [] nums={2,7,11,15};
        int target=9;
        int [] ind=new int[2];

        for (int i = 0, j=1; i < nums.length; i++,j++) {   // O(n2)
            if (nums[i]>target){continue;}                 // constant
            if (target-nums[i]==nums[j]){                  // constant
                ind[0]=i; ind[1]=j;
                System.out.println(Arrays.toString(ind));

            }
        }

    }

}
