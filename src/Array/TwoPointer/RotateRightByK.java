package Array.TwoPointer;

public class RotateRightByK {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateRightByK(int[] arr, int k) {
        int n = arr.length;

        if (n == 0) return;

        k = k % n;

        // 1. reverse entire array
        reverse(arr, 0, n - 1);

        // 2. reverse k element
        reverse(arr, 0, k - 1);

        // 3. reverse n-k element
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotateRightByK(arr, k);

        for (int a : arr)
            System.out.print(a + " ");
    }
}
