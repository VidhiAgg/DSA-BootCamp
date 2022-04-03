package com.dsa.Searching.Linear;
/*
Question: https://leetcode.com/problems/richest-customer-wealth/
Solution: https://leetcode.com/problems/richest-customer-wealth/discuss/1911327/JJAVA-Easy-solution
SpaceComplexity: O(1)
Time Complexity: O(n)
 */
public class RichestCommonWealth {
    public static void main(String[] args) {
        int accounts[][] = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            //whenever u start a new column , take a sum of that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            //sum of accounts of person
            if (sum > ans)
                ans = sum;

        }
        return ans;
    }

}


