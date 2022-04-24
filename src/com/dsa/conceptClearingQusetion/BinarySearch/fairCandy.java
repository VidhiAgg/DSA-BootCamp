package com.dsa.conceptClearingQusetion.BinarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
     //Question ->https://leetcode.com/problems/fair-candy-swap/
//Solution: https://leetcode.com/problems/fair-candy-swap/discuss/1975233/JAVA-Solution
explation:
//https://leetcode.com/problems/fair-candy-swap/discuss/1554019/Java-Easy-to-Understand-O(1)-Space-%2B-Binary-Search
*/
public class fairCandy {
    public static void main(String[] args) {
        int[] a={1,1};
        int[] b ={2,2};
        System.out.println(Arrays.toString(fairCandySwap(a,b)));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0; int sumB = 0;
        for (int i : aliceSizes) sumA += i;

        for (int i : bobSizes) sumB += i;

        int sumDiff = (sumB - sumA) / 2;
        Set<Integer> y = new HashSet<>();

        for (int element : bobSizes)
            y.add(element);

        for (int x : aliceSizes) {
            if (y.contains(x + sumDiff))
                return new int[]{x, x + sumDiff};
        }
        return new int[]{};
    }
}
