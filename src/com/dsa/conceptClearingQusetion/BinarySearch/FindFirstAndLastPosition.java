package com.dsa.conceptClearingQusetion.BinarySearch;

import java.util.Arrays;

/*
question: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
solution: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/discuss/1933407/Clean-Binary-Search-with-explanation-easy-to-understand-O(logn)
 */
public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int nums [] = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRangeB(nums,target)));

    }
    public static int[] searchRange(int [] nums, int target){
        int ans [] =  {-1,-1};
        //check first occurence
        ans[0] = search(nums, target, true);
        if(ans[0] == -1)
            return ans;
        else {
            //check second occurence
            ans[1] = search(nums, target, false);
        }
       return  ans;
    }
    public static int search(int []  arr, int target, boolean firstIndex)
    {
        int start = 0; int end = arr.length-1; int index =-1;
        while(start<=end) {
            //find the middle element
            // start+mid/2 might be possible that (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else {
                index = mid;
                if(firstIndex) {
                    end = mid - 1;
                }
                    else{
                        start  = mid+1;
                    }
                }
            }
        return index;

    }


    public static int[] searchRangeB(int[] nums, int target) {

        //edge case
        //if nums is empty
        if(nums.length == 0)
            return new int[]{-1,-1};

        //if the last element is nums is greater than target, than target is not there
        if(nums[nums.length-1] < target)
            return new int[]{-1,-1};

        //if first and last elements are same and equal to target than whole array is filled with target
        if(nums[0] ==  target && nums[nums.length-1] == target)
            return new int[]{0,nums.length-1};



        int i =0, j =nums.length-1;
        int ans[] = {-1,-1};
        while(i<nums.length-1)
        {
            if(nums[i] ==  target  )
            {
                ans[0] =  i;
                break;
            }
            i++;

        } while(j>=0)
        {
            if(nums[j] ==  target  )
            {
                ans[1] =  j;
                break;
            }
            j--;

        }
        return ans;
    }
}
