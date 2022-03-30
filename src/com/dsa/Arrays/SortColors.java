package com.dsa.Arrays;

import java.util.Arrays;
/*
Question: https://leetcode.com/problems/sort-colors/
Solution: https://leetcode.com/problems/sort-colors/discuss/1898492/JAVA-O(N)-solution-3-approaches
Explanation: https://leetcode.com/problems/sort-colors/discuss/1543708/Easy-Clean-Code-With-Comments
SpaceComplexity: O(1)
Time Complexity: O(n)
one-pass algo: https://stackoverflow.com/questions/46304035/what-is-a-one-pass-algorithm-and-is-mine-one
 */
public class SortColors {
    public static void main(String[] args) {
        int nums [] = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int low =0; int high = nums.length-1;
        int index = 0; //to keep track of current element
        while(index<=high){
            if(nums[index] == 0)
            {
                swap(nums, low, index);
                low++; index++;
                //with this we will have all elements as 0 before low
            }
            else if(nums[index] == 2)
            {
                swap(nums, high, index);
                high--;
                //with this we will have all elements as 2 after high
            }
            else
                index++;
        }
    }
    public static void  swap(int [] nums, int num1, int num2)
    {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}

/*
Approach : 1 Brute Force solution
1-> Iterate very element and count the number of 0,s,1;s and 2's
2-> Now add the 0,s,1;s and 2's in ascending order till their respective count becomes zero.

public  void sortColors(int[] nums) {
        int rcount = 0; int wcount = 0; int bcount =0
        //for counting
        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i] == 0)rcount++;
            else if(nums[i] == 1) wcount++;
            else if (nums[i] == 2) bcount++;

        }
        //now modified the nums, according to the count
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
Approach2 : Little Changes -> Same aaproach but
1-> Iterate very element and count the number of 0,s,1;s
and for 2's just subtract the sum of count of 1 & 0 from total length
2-> Now add the 0,s,1;s and 2's in ascending order till their respective count becomes zero.
public void sortColors(int[] nums) {
        int rcount = 0; int wcount = 0; int bcount =0;
        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i] == 0)rcount++;
            else if(nums[i] == 1) wcount++;


        }
        //for 2's just subtract the sum of count of 1 & 0 from total length
        bcount = nums.length-rcount-wcount;
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
 */