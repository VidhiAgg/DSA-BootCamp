package com.dsa.BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] ={
                2,3,4,5,6,8,40,70,80,90,909};
        int target = 2;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
        }
        public static int binarySearch(int []  arr, int target)
        {
            int start = 0; int end = arr.length-1;
            while(start<=end) {
                //find the middle element
                // start+mid/2 might be possible that (start+end) exceeds the range of int in java
                int mid = start + (end - start) / 2;
                if (target < arr[mid])
                    end = mid - 1;
                else if (target > arr[mid])
                    start = mid + 1;
                else //ans found
                    return mid;
            }
            return -1;

        }
    }

