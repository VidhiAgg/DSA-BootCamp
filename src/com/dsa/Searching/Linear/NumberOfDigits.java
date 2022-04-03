package com.dsa.Searching.Linear;
/*
Question: https://leetcode.com/problems/find-numbers-with-even-number-of-digits
Solution: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/discuss/1911081/JAVA-100Runtime-Easy-to-undersatnd

SpaceComplexity: O(1)
Time Complexity: O(n)

 */
public class NumberOfDigits {
    public static void main(String[] args) {

        int arr [] = {203,4,5,75,1764, 18};
        int count = 0;
        //for loop to check whether the element is even or not
        for(int element : arr)
        {
            if( digits2(element) % 2 == 0)
                count++;
        }
        System.out.println(count);
    }
    //to calculate the numbner of digits
    static  int digits(int num){
        if(num < 0)
            num *=-1;
        if(num ==0)
            return 1;
        int digitCount =1;
        while((num /= 10) != 0)
        {
           digitCount++;
        }
        return  digitCount;
    }
    static  int digits2(int num){
        if(num < 0)
            num *=-1;
        if(num ==0)
            return 1;

        return (int)((Math.log10(num))+1);
    }
}
