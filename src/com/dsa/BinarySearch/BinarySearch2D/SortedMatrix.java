package com.dsa.BinarySearch.BinarySearch2D;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int matrix [][]= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,13},
        };
        int target = 9;
        System.out.println(Arrays.toString(searchSorted(matrix,target)));
    }
    //do binary search, in which row and from which col to which col you want to search

    public static  int [] binarySearch(int [][] matrix, int row, int cStart, int cEnd, int target)
    {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid] == target){
                return new int[] {row,mid};
            }
            else if (matrix[row][mid] > target){
                cEnd = mid-1;
            }
            else{
                cStart = mid+1;
            }
        }
        return new int[] {-1,-1};

    }
    public  static int[] searchSorted(int[][]matrix, int target)
    {
       int rows = matrix.length;
       int col = matrix[0].length; //matrix can be empty
        if(col == 0)
            return new int [] {-1,-1};
       if(rows == 1)
       {
           //do binary search, in which row and from which col to which col you want to search
           return binarySearch(matrix,0,0,col,target);
       }
       int rStart  = 0; int rEnd = rows-1;
       int cMid = col/2;
       //run loop till two rows are remaining
       while(rStart <  (rEnd-1)) // while this is true we will be having more than two rows
       {
           int mid = rStart + (rEnd-rStart)/2;
           if(matrix[mid][cMid] == target)
               return new int[] {mid,cMid};
           else if(matrix[mid][cMid] > target )
           {
               rEnd = mid;
           }
           else
               rStart = mid;
       }
       //now we will be having two rows
        //check whether target is in the middle column
        if(matrix[rStart][cMid] == target)
            return new int[]{rStart, cMid};

       else if(matrix[rStart+1][cMid] == target) {
            return new int[]{rStart+1, cMid};
        }

        //else check four cases
        //Case1: if target < currentElement
        //search in first half
        else if( target <= matrix[rStart][cMid-1] ) {
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }

        //Case2: search in 2nd half

        else if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][col-1]) {
            return binarySearch(matrix,rStart,cMid+1,col-1,target);
        }
        //Case3: search in 3rd half

       else  if(target <= matrix[rStart+1][cMid-1]  ) {
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
       //case4: saerch in 4th half
        else
        return binarySearch(matrix,rStart+1,cMid+1,col-1,target);
    }
}
