package assignment1;

import java.util.Arrays;

public class TwoSumOptimal1 {
    public static void main(String[] args) {

        int[] array=new int[]{2,7,9,11};

        System.out.println(Arrays.toString(twoSumSolution1(array,9)));//[0, 1]


    }
//Bruteforce Solution of Two Sum problem

    public static int[] twoSumSolution1(int[] array, int targetValue){
        for(int i=0; i <  array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (i != j) {//if not equal - compare

                    if (array[i] + array[j] == targetValue) return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

}
/*
Problem: Two Sum
• Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
• You may assume that each input would have exactly one solution, and you
may not use the same element twice.
• You can return the answer in any order.
• No solution will return empty array.
Example:
Input: nums = [2, 7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Ask questions to interviewers !

Is the array sorted?
- No
• No duplicated values accepted

Model It
Looking for:
Such array[i]+ array[j] = target value;

Target value= 9
2 7 11 15
i j

Find a Brute Force Solution
If (array[i]+ array[j] == target value) return i & j;

from 2 to 11
         i
2     7      11      15
           j
           from 7 to 15

Find a Brute Force Solution

Pseudo Code:

for(int i=0;i<length();i++) begin
for(int j=0;j<length();j++) begin
if (array[i] + array[j]==targetValue) return i & j
end
end

 */
