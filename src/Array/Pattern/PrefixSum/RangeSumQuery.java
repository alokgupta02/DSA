package Array.Pattern.PrefixSum;

public class RangeSumQuery {
    public static void main(String[] args) {

        int[] arr = { 2, 4, 1, 3, 6, 5 };
        int n = arr.length;

        printArray(arr);
        System.out.println();

        int[] pref = new int[n];
        pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        printArray(pref);
        System.out.println();
        // Example Queries: [L, R]
        int[][] queries = { { 1, 3 }, { 0, 2 } };

        // Step 2: Answer each query in O(1)
        for (int[] query : queries) {
            int L = query[0];
            int R = query[1];

            long sum = (L == 0) ? pref[R] : pref[R] - pref[L - 1];
            System.out.println("Sum of range [" + L + ", " + R + "] is: " + sum);
        }
    }

    private static void printArray(int[] arr) {
        for (int a : arr)
            System.out.print(a + " ");
    }
}
