package com.dsa.Arrays;
/*
Question: https://leetcode.com/problems/first-missing-positive/
Solution: https://leetcode.com/problems/first-missing-positive/discuss/1903797/JAVA-SOLUTION-WITH-COMMENT
Time Complexity O(N)
Space Complexity: O(1)
Question technique: Cylic sort
Explanation: https://leetcode.com/problems/first-missing-positive/discuss/17083/O(1)-space-Java-Solution
           : https://leetcode.com/problems/first-missing-positive/discuss/858526/Cyclic-Sort-Explained


 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int nums[] = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));

    }
    public static int firstMissingPositive(int[] nums) {
        int i =0 ;
        while(i<nums.length)
        //nums[i] <nums.length with this we ignore arrayIndexBound error
            //nums[i] != nums[nums[i]-1] with this duplicacy is removed


        {
            if (nums[i] > 0 && nums[i] <nums.length && nums[i] != nums[nums[i]-1] )
                swap(nums, i , nums[i]-1);
            else
                i++;
        }

        for( i =0; i<nums.length; i++)
        {
            if (nums[i] != i+1 )
                return i+1;
        }
        return nums.length+1;
    }
    public static void swap (int nums[], int i , int j){
        int  temp =  nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
