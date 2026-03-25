package Array.Pattern.TwoPointer;

public class RotateByK {

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateRightByK(int[] arr, int k) {

        // ---- Validation ----
        if (arr == null || arr.length == 0) {
            return; // nothing to rotate
        }

        int n = arr.length;

        // Normalize k (handles k > n and negative k)
        k = k % n;

        if (k < 0) {
            k = k + n; // optional: handle negative rotation
        }

        // If k becomes 0, no rotation needed
        if (k == 0) {
            return;
        }

        // ---- Reversal Algorithm ----
        // Step 1: Reverse entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    public static void rotateLeftByK(int[] arr, int k) {
        // ---- Validation ----
        if (arr == null || arr.length == 0) {
            return; // nothing to rotate
        }

        int n = arr.length;

        // Normalize k (handles k > n and negative k)
        k = k % n;

        if (k < 0) {
            k = k + n; // optional: handle negative rotation
        }

        // If k becomes 0, no rotation needed
        if (k == 0) {
            return;
        }

        // 1. Reverse first part : k element
        reverse(arr, 0, k - 1);

        // 3. Reverse second part : n-k element
        reverse(arr, k, n - 1);

        // 1. Reverse entire array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;

        // rotateRightByK(arr, k);
        rotateLeftByK(arr, k);

        for (int a : arr)
            System.out.print(a + " ");
    }
}