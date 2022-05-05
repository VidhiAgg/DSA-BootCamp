package com.dsa.conceptClearingQusetion.BinarySearch;

public class Sqrt {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE+1);
    }
    public static int mySqrt(int x) {
        if(x==0)
            return 0;
        int start = 1; int end =x;
        while(start<=end){
            int mid = start+(end-start)/2;
            /*Trick used
            * mid <=x/mid instead of mid*mid to avoid exceeding integer upper limit
            * For folks wondering what is the (mid + 1) > x / (mid + 1) for:
            * There are comments on threads where it is mentioned: it is to prevent overflow.
            * But they do not mention how integers overflow in Java. Let me tell you why:
            * In a nutshell, they overflow in a circular fashion.
            * Meaning if you do Integer.MAX_VALUE + 1 it will yield Integer.MIN_VALUE.
            * Same for the other way around.
            * Try printing these expressions in a Java program to really see it in action.
            * So when we found our value mid <= x / mid, it is important to check if it is not overflowing.
            * If it overflows, then it rolls over to the negative integers
            * and thus the value of mid + 1 can never be greater than x/mid +
            *
            * For more check this
            * https://leetcode.com/problems/sqrtx/discuss/25198/3-JAVA-solutions-with-explanation/295983
            */

            if(mid <=x/mid && (mid + 1) > x / (mid + 1))
                return mid;
            else if(mid > x/mid)
                end = mid;
            else
                start = mid+1;

        }
        return start;
    }
}
