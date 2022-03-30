package com.dsa.Arrays;

import java.util.Arrays;
/*
Question: https://leetcode.com/problems/sort-colors/
SpaceComplexity: O(1)
Time Complexity: O(1)
 */
public class SortColors {
    public static void main(String[] args) {
        int nums [] = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int rcount = 0; int wcount = 0; int bcount =0;
        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i] == 0)rcount++;
            else if(nums[i] == 1) wcount++;
            else if (nums[i] == 2) bcount++;

        }
        for(int i =0; i<nums.length; i++)
        {
            if(rcount > 0){
                nums[i] = 0;
                rcount--;
            }
            else if(wcount > 0)
            {
                nums[i] = 1;
                wcount--;
            }
            else if(bcount>0)
            {
                nums[i] = 2;
                bcount--;
            }
        }
    }
}
