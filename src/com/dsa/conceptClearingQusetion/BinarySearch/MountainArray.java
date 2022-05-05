package com.dsa.conceptClearingQusetion.BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//sol: https://leetcode.com/problems/peak-index-in-a-mountain-array/discuss/1934019/detailed-explained-JAVA-Code


public class MountainArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,4,3,2};
        System.out.println(peakIndexInMountainArray(arr));

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
         int end = arr.length-1;
         while(start < end){
             int mid = start + (end-start)/2;
             if(arr[mid] > arr[mid+1]) {
                 //you are in dec part
                 //this might be the ans, possibility but we need to check in right also
                 //this is why end != mid-1
                 end = mid;
             }
             else {
                 //you will be in asec part
                 //because we know mid+1> mid
                 start = mid + 1;
             }
         }
         //in the satrt == end
        //pointing to larget number because of two check
        //start and end are always trying to dind max element in above to checks
        //when they poiting to same element that is max
        //at every point of time of start and end, they will have max possible ans at that time
        //and if we are saying only one item is reaming, hence coz of above line
        return start ;
                //return end sam ething
    }
}

