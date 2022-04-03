package com.dsa.Searching.Linear;

import java.util.Scanner;

/*
Question: We have a array search in that array in particular range, start and end is given
 */
public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr []= {-2, 0 ,3, 4, 7, 8 ,2,3,5,4,6,8,6,19};

        System.out.println("Enter the target");
        int target = in.nextInt();

        System.out.println("Enter the start");
        int start = in.nextInt();

        System.out.println("Enter the end");
        int end = in.nextInt();


        System.out.println(linearSearch(arr, target, start, end));

    }
    static int linearSearch(int []arr, int target, int start, int end)
    {
        //edge case
        if(arr.length == 0)
            return -1;
        //run a for loop
        for(int index = start; index <= end; index++)
        {
            if(arr[index] == target)
                return  index;
        }
        //if element is not found
        return  Integer.MAX_VALUE;
    }
}
