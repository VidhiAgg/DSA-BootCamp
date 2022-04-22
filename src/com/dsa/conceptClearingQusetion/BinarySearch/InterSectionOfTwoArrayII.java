package com.dsa.conceptClearingQusetion.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
                //https://leetcode.com/problems/intersection-of-two-arrays-ii
public class InterSectionOfTwoArrayII {
    public static void main(String[] args) {
        int [] num1 = {1,2,2,1};
        int [] num2 = {2,2};
        System.out.println(Arrays.toString(intersect(num1,num2)));

    }
    //two pointer approach
    public static int[] intersect(int[] nums1, int[] nums2) {
        //with binary solution, we will decrease space complexity but time complexity will be increased.
        //sort an array
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0; int j =0;int k =0;
        while(i<nums1.length && j < nums2.length)
        {
            if(nums1[i] < nums2[j])
                i++;
            else if(nums1[i] == nums2[j])
            {
                ls.add(nums1[i]);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        int res [] = new int[ls.size()];
        int temp = 0;
        //store the elements of set into array for ans.
        for(int ele: ls)
        {
            res[temp++] = ele;
        }
        return res;
    }
}
