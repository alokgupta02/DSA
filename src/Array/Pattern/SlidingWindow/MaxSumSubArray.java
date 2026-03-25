package Array.Pattern.SlidingWindow;

public class MaxSumSubArray {

    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400, 500 };
        int n = arr.length;
        int k = 2;

        int sum = 0, ans = 0;

        // find first sum
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int left = 0, right = k;

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

}
