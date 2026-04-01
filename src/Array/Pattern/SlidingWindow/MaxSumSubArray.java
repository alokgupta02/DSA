package Array.Pattern.SlidingWindow;

public class MaxSumSubArray {

    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400, 500 };
        int k = 2;

        //bruteSolution(arr, k);
        optimalSolution(arr, k);

    }

    private static void optimalSolution(int[] arr, int k) {
        int n = arr.length;
        int sum = 0, ans = 0;
        int left = 0, right = k;

        // find first sum
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        while (right < n) {
            ans = Math.max(ans, sum);
            sum += arr[right];
            sum -= arr[left];
            left++;
            right++;
        }
        ans = Math.max(ans, sum);
        System.out.println(ans);
    }

    private static void bruteSolution(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int ans = 0;

        while (i <= n - k) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            ans = Math.max(ans, sum);
            i++;
        }
        System.out.println(ans);
    }
}