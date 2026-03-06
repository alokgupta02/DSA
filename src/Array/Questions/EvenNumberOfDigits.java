/**
 * Author: Alok Gupta
 * Date:06-03-2026
 * Time:12:05
 */
package Array.Questions;

public class EvenNumberOfDigits {

    /*https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
    get num = arr[i]
    while num <= 0, num /10 --> len++
    check if len is even, increment count
    return count*/

    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};

        //Approach 1: //Brute //time = O(n) //space: O(1)
        //System.out.println(approachOne(nums));

        //Approach 2: //Optimized //time = O(n) //space: O(1)
        //System.out.println(approachTwo(nums));
        
        // Approach 3: // Better
        //System.out.println(approachThree(nums));

        // Approach 4:
        System.out.println(approachFour(nums));
    }

    private static int approachOne(int[] nums) {
        int evenCount = 0;

        for (int i : nums) {
            if(isEvenDigit(i)){
                evenCount++;
            }
        }
        return evenCount;
    }
    private static boolean isEvenDigit(int n){
        int digitCount = 0;

        while(n !=0){
            n = n/10;
            digitCount++;
        }
        return digitCount % 2 == 0;
    }

    private static int approachTwo(int[] nums) {
        int count = 0;
        for(int i : nums){
            int n = String.valueOf(i).length();
            if(n % 2 == 0){
                count++;
            }
        }
        return count;
    }

    private static int approachThree(int[] nums) {
        int evenCount = 0;
        for(int i : nums){
            int digitCount = (int) Math.floor(Math.log10(i)) + 1;

            if(digitCount % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }

    private static int approachFour(int[] nums) {
        int evenCount = 0;
        for(int i : nums){
            if(i >10 && i <=99 || i > 1000 && i <= 9999 || i == 10000)
                evenCount++;
        }
        return evenCount;
    }
}