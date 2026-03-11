/**
 * Author: Alok Gupta
 * Date:10-03-2026
 * Time:21:06
 */
package Array.TwoPointer;

import java.util.Arrays;
 // https://leetcode.com/problems/squares-of-a-sorted-array/description/
public class SqSortedArr {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9};
        int[] arr2 = {-3, -2, -1, 4, 7, 9};

        //approachOne(arr);
        approachTwo(arr2);

    }

    private static void approachOne(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i] * arr[i];
            arr[i] = num;
        }

        Arrays.sort(arr);

        for (int a : arr)
            System.out.print(a + " ");

    }

    private static void approachTwo(int[] arr2) {
        int n = arr2.length;
        int l = 0, r = n - 1;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int val;
            if (Math.abs(arr2[l]) > Math.abs(arr2[r])) {
                val = arr2[l];
                l++;
            } else {
                val = arr2[r];
                r--;
            }
            result[i] = val * val;
        }

        for (int a : result)
            System.out.print(a + " ");
    }
}