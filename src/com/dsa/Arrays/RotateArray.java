package com.dsa.Arrays;
/*
Question: https://leetcode.com/problems/rotate-array
Solution: https://leetcode.com/problems/rotate-array/discuss/1895291/Rotate-Array-Java-Solution-oror-0ms-oror-easy-to-understand-oror-swapping-without-third-variable
Time Complexity: O(n)
Space Complexity: O(1)
 */
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));

    }
    public static void  rotate(int[] nums, int k) {
    int n = nums.length ;
    k %=n;
    if(k < 0 )
        k += n;
    //divide the array in two parts
    //first part will be starting from first index till the kth part
    //second part will be starting just from the kth to n-1
    //in the last revers the whole array
    reverse(nums, 0 , n-k-1);
    reverse(nums, n-k, n-1);
    reverse (nums,0,n-1);

}
    public static void  reverse ( int [] nums, int start, int end)
    {
        while(start<end)
        {
            nums[start] = nums[start]+nums[end];
            nums[end] = nums[start]-nums[end];
            nums[start] =  nums[start] - nums[end];
            start++;end--;
        }
    }

}
