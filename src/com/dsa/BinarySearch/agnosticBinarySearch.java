package com.dsa.BinarySearch;

public class agnosticBinarySearch {
    public static void main(String[] args) {
        int arr[]={10,9,8,7,6,5,4,3,2,1};
        int arr2[]={1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        int target2 = 7;
        int ans = callSearch(arr2, target2);
        System.out.println(ans);
    }
    public static int callSearch(int []  arr, int target)
    {
        int start = 0; int end = arr.length-1;
        if(arr[start] == arr[end])
            return start;
        boolean isDesc = arr[start]> arr[end];
        while(start<=end) {
            //find the middle element
            // start+mid/2 might be possible that (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return  mid;
            if(isDesc)
            {
                if (target > arr[mid])
                    end = mid - 1;
                else if (target < arr[mid])
                    start = mid + 1;
            }
            else{
                if (target < arr[mid])
                    end = mid - 1;
                else if (target > arr[mid])
                    start = mid + 1;
            }
        }

        return -1;

    }
}
