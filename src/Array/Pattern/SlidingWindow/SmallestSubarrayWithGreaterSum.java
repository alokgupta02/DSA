package Array.Pattern.SlidingWindow;

//https://www.geeksforgeeks.org/dsa/minimum-length-subarray-sum-greater-given-value

public class SmallestSubarrayWithGreaterSum {

    public static void main(String[] args) {

        int[] arr = { 1, 4, 45, 6, 0, 19 };
        int x = 51;
        int n = arr.length;
        int i = 0, j = 0, sum = 0;
        int ans = n;

        while (j < n) {
            sum += arr[j];
            while (i <= j && sum > x) {
                ans = Math.min(ans, j - i + 1);
                sum -= arr[i];
                i++;
            }
            j++;
        }
        System.out.println(ans);
    }
}
