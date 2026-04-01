package Array.Pattern.SlidingWindow;

//https://www.geeksforgeeks.org/dsa/minimum-length-subarray-sum-greater-given-value

// variable window
public class SmallestSubarrayWithGreaterSum {

    public static void main(String[] args) {

        int[] arr = { 1, 4, 45, 6, 0, 91 };
        int x = 51;

        // bruteSolution(arr, x);
        optimalSolution(arr, x);

    }

    private static void bruteSolution(int[] arr, int x) {
        int n = arr.length;
        int min = n;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum >= x) {
                    min = Math.min(min, j - i + 1);
                    break;
                }
            }
        }
        System.out.println(min);

    }

    private static void optimalSolution(int[] arr, int x) {
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
