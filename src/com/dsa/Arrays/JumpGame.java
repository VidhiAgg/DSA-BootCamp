package com.dsa.Arrays;
/*
https://leetcode.com/problems/jump-game/
You are given an integer array nums. You are initially positioned at the array's first index,
and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.
Example 1:
Input: nums = [2,3,1,1,4]
Output: true
Time Complexity : O(N)
Space Complexity : O(1)
 */
public class JumpGame {
    public static void main(String[] args) {
        int nums [] = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }

        public static boolean canJump(int[] nums) {
        /*
        We will be starting from the last index and will keep the track of the last spot which can let us
        to reach the last index.So, if we are at position 3 (value =1) and if  we know that if we can reach
        at position 2, than that means that with position 2 -> position 3-> position 4(goal) so, we will save 2



         */
            int lastIndexPosition = nums.length-1;
            for(int i = lastIndexPosition-1; i>=0;i--){
                /*
               with this condition we will check that if we jump from a index i and how many steps u can jump is
               given by nums[i], are we able to reach last index if yes we will update our lastIndexPoition as i
                 */
                if(i+nums[i] >= lastIndexPosition){
                    lastIndexPosition = i;
                }
            }
            return lastIndexPosition==0;
        }

}
