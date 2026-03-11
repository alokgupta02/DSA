/**
 * Author: Alok Gupta
 * Date:10-03-2026
 * Time:23:58
 */
package Array.TwoPointer;
// https://leetcode.com/problems/duplicate-zeros/description/
// https://youtu.be/AAkM5vnn7sc?si=_fbq3ijjMPadKTUw
public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        //approachOne(arr);
        approachTwo(arr);
    }

    private static void approachOne(int[] arr) {
        int n = arr.length;

        int[] result = new int[n];
        int d = 0;

        for(int i = 0; i<result.length;i++){
            if(arr[d] != 0){
                result[i] = arr[d];
            }else{
                result[i] = arr[d];
                i++;
                result[i] = arr[d];
            }
            d++;
        }

        for(int a : result)
            System.out.print(a + " ");
    }

    //in place modification
    private static void approachTwo(int[] arr) {
        int n = arr.length;
        int zeroes = 0;
        int lastIdx = n -1;

        for(int i = 0; i<= lastIdx-zeroes; i++){
            if(arr[i]==0){
                // edge case
                if(i == lastIdx-zeroes){
                    arr[lastIdx] = 0;
                    lastIdx--;
                    break;
                }
                zeroes++;
            }
        }

        int newLastIdx = lastIdx - zeroes;

        for(int i = newLastIdx; i>=0; i--){
            if(arr[i]==0){
                arr[i + zeroes] = 0;
                zeroes--;
                arr[i+zeroes] = 0;
            }else{
                arr[i+zeroes] = arr[i];
            }
        }

        for(int a : arr)
            System.out.print(a + " ");
    }

}