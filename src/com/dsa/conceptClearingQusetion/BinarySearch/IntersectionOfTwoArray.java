package com.dsa.conceptClearingQusetion.BinarySearch;

import java.util.*;

//https://leetcode.com/problems/intersection-of-two-arrays

//https://leetcode.com/problems/intersection-of-two-arrays/discuss/1975241/Java-solution
public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int [] num1 = {1,2,2,1};
        int [] num2 = {2,2};
        System.out.println(Arrays.toString(intersection(num1,num2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        //with binary solution, we will decrease space complexity but time complexity will be increased.
        //sort an array
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();
        //run the loop to check for the number present in num2 array, if yes store it in set
        //since set store only unique element duplicate of elements will not be there
        for(int num: nums1)
        {
            if(binarySearch(nums2, num))
                set.add(num);

        }
        int res [] = new int[set.size()];
        int i = 0;
        //store the elements of set into array for ans.
        for(int ele: set)
        {
            res[i++] = ele;
        }
        return res;

    }
    private static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    //using set

                public static int[] intersectionSet(int[] nums1, int[] nums2) {
                    //with binary solution, we will decrease space complexity but time complexity will be increased.
                    //sort an array
                    Set<Integer> set = new HashSet<>();
                    List<Integer> lst = new ArrayList<>();
                    for(int num: nums1)
                    {
                        set.add(num);
                    }
                    //Arrays.sort(nums2);
                    for(int n: nums2)
                    {
                        if(set.contains(n))
                        {
                            lst.add(n);
                            set.remove(n);
                        }
                    }
                    int res [] = new int[lst.size()];
                    int i = 0;
                    for(int ele: lst)
                    {
                        res[i++] = ele;
                    }
                    return res;

                }

}

