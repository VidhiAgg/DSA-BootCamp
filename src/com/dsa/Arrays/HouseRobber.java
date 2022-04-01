package com.dsa.Arrays;
/*
Question: https://leetcode.com/problems/house-robber/
Solution: https://leetcode.com/problems/house-robber/discuss/1903818/JAVA-DP-O(n)-O(1)
Time Complexity O(N)
Space Complexity: O(1)
Question technique: Dynamic Programming
Explanation: https://leetcode.com/problems/house-robber/discuss/1605334/JAVA-or-DP-or-With-and-Without-Space-or-Explained



 */
public class HouseRobber {
    public static void main(String[] args) {
        int [] nums ={};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        int n = nums.length;
        int dp1 =  nums[0], dp2 = Math.max(dp1, nums[1]), dp = dp2;
        for(int i =2;i<nums.length;i++)
        {
            dp = Math.max(nums[i] + dp1, dp2 );
            dp1 = dp2;
            dp2 = dp;

        }
        return dp;
    }
   /* public static int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        int n = nums.length;
        int dp [] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        for(int i =2;i<nums.length;i++)
        {
            dp[i] =  Math.max(nums[i] + dp[i-2] , dp[i-1]);
        }
        return dp[n-1];
    }*/
}
