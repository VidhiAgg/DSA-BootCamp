package com.dsa.BinarySearch.BinarySearch2D;

public class CountNegative {
    public static void main(String[] args) {

    }

    //Time complexity o(nlogm)
    public static int countNegatives(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0; int lastNeg = cols-1;
        for(int row = 0; row < rows; row++){
            //if 1st element of a row is -ve => all elements in that row will be negative.
            if(grid[row][0] < 0)
            {
                count += cols;
                continue;
            }
            if(grid[row][cols-1] > 0) // if element at last is -ve all elements b4 that will be positive
            {
                continue;
            }
            int left = 0; int right = lastNeg;
            //run the loop to find the index of negative number in a particular row
            while(left<=right)
            {
                int mid = left + (right-left)/2;
                if(grid[row][mid] < 0)
                {
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
            //number of -ve elements will be equal to total columns - column of first -ve number
            count += (cols-left) ;
            //assign starting column to the lastNeg because in the next row all the elements will be -ve at that column
            lastNeg = left;
        }
        return count;
    }

    public static int countNegativesII(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;  int col =0; int row = rows-1;
        while(row >= 0 && col < cols ){
            if(grid[row][col] <0)
            {
                --row;
                count += cols-col;
            }
            else{
                ++col;
            }

        }
        return count;
    }


}
