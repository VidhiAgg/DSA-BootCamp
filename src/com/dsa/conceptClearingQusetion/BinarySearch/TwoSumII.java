package com.dsa.conceptClearingQusetion.BinarySearch;

import java.util.Arrays;
/*
* https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
*
 */
public class TwoSumII {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
        System.out.println(Arrays.toString(twoSumBS(arr,target)));


    }
    //Approach 1 Two pointers
    //time complexity 0(n)
    public static int[] twoSum(int[] numbers, int target) {
        int j = numbers.length-1; int i =0;
        while(i<j)
        {
            int sum = numbers[i] + numbers[j];
            if(sum ==  target)
            {
                return new int[]{i+1, j+1};
            }
            if (sum > target)
                j--;
            if(sum < target)
                i++;
        }
        return new int[]{-1,-1};
    }
    /*
    Approach 2 Binary search
     */
    public static int[] twoSumBS(int[] numbers, int target) {
        int r = numbers.length-1; int l =0;
        while(numbers[r] + numbers[l] != target){
            if (numbers[l] + numbers[r] > target) {
                if (numbers[r - 1] > target - numbers[l])
                    r = binarySearch(numbers, l + 1, r - 1, target - numbers[l]);
                else
                    r--;
            }
            else {
                if (numbers[l + 1] < target - numbers[r])
                    l = binarySearch(numbers, l + 1, r - 1, target - numbers[r]);
                else
                    l++;
            }
        }
        return new int[] { l + 1, r + 1 };
    }
    public static int binarySearch(int[]nums, int start, int end, int target){
        int mid = start + (end-start)/2;
        if(nums[mid] == target)
            return mid;

        if(end<=start)
            return mid;

        else if (nums[mid] > target)
        {
            return binarySearch(nums, start, mid-1, target );

        }
        else if (nums[mid] < target){
            return binarySearch(nums, mid+1,end, target );
        }

        return mid;
    }
}
