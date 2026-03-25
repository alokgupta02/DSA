package Array.Pattern.TwoPointer;

public class TwoSumSorted {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 4, 9 };
        int target = 12;

        twoSum(arr, target);

    }

    private static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[] { left, right };
            }
        }
        return new int[] {};
    }
}
