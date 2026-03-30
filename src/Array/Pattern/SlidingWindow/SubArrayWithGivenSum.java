package Array.Pattern.SlidingWindow;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int sum = 23;

        int[] subArr = findSubarray(arr, sum);
    }

    private static int[] findSubarray(int[] arr, int sum) {
        int n = arr.length;
        int i = 0, j = 0, cSum = 0;

        while (j < n) {
            cSum += arr[j];
            while (i <= j && cSum > sum) {
                cSum -= arr[i];
                i++;
            }
            if (cSum == sum && i <= j) {
                // System.out.println(i + 1 + " " + j + 1);
                return new int[] { i + 1, j + 1 };
            }
            j++;
        }
        return new int[] {};
    }
}
