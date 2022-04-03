package com.dsa.Searching.Linear;

public class LinearSearch {
    public static void main(String[] args) {
      int arr [] = {2,4,6,7,40,3,5,2};
      int target = 6;
        System.out.println(linearSerach(arr, target));
        System.out.println(linearSerach2(arr, target));
        System.out.println(linearSerach3(arr, target));
    }
    //search the target and return the
    // index of that element
    static int linearSerach(int []arr, int target)
    {
        //edge case
        if(arr.length == 0)
            return -1;
        //run a for loop
        for(int index = 0; index< arr.length; index++)
        {
            if(arr[index] == target)
                return  index;
        }
        //if element is not found
        return  Integer.MAX_VALUE;
    }

    static int linearSerach2(int []arr, int target)
    {
        //edge case
        if(arr.length == 0)
            return -1;
        //run a for loop
        for(int element : arr)
        {
            if(element == target)
                return  element;
        }
        //if element is not found
        return  Integer.MAX_VALUE;
    }
//return true or false

    static boolean linearSerach3(int []arr, int target)
    {
        //edge case
        if(arr.length == 0)
            return false;
        //run a for loop
        for(int element : arr)
        {
            if(element == target)
                return  true;
        }
        //if element is not found
        return  false;
    }
}