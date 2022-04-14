package com.dsa.conceptClearingQusetion.BinarySearch;
 //https://leetcode.com/problems/valid-perfect-square/
public class SqrtCheck {
    public static void main(String[] args) {
        int n = 2147483647;
        System.out.println(isPerfectSquare(n));
    }
    public static boolean isPerfectSquare(int n) {
        if (n==1)
            return true;
        long start = 1; long end = n;
        while(start <= end){
            long mid = start+(end-start)/2;

            if(mid*mid == n)
                return true;
            if(mid*mid > n)
                end = mid-1;
            else if(mid * mid < n)
                start = mid+1;

        }
        return false;

    }
}
