package com.dsa.Searching.Linear;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //here the compiler knows that you are initializing the array of int. So, it's not mandatory to write new
        //but at line its  28 not know where it is declared
        int arr[][] = {
                {2, 3, 4, 6,},
                {2, 6},
                {4, 6, 2, 89, 67},
                {4, 3, 8, 0, -1}
        };
        for(int[] ar: arr)
            System.out.println(Arrays.toString(ar));
        System.out.println("Please enter the number you want to search from the above array");
        int target  =  in.nextInt();
        int [] ans = search(arr,target); // format of return values {row,col}
        System.out.println(Arrays.toString(ans));
        //MAXI
        System.out.println(max(arr));
        //MIN
        System.out.println(min(arr));
    }
    public static  int[] search(int[][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target)
                    return new int[]{row,col};

            }

        }
        return  new int[]{-1,-1};
    }
    //will give you the maximum element index position, if not found will give you integer max value
    public static  int max(int[][]arr){
        int max= Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] >max)
                   max= arr[row][col];

            }

        }
        return  max;
    }
    // will return min value present in array
    public static  int min(int[][]arr){
        int min= Integer.MAX_VALUE;
        for (int[] array:arr) {
            for (int ele: array) {
                if(ele <min)
                    min=ele;

            }

        }
    return min;
    }
}
