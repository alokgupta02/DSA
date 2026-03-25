package Array.Pattern.TwoPointer;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 1, 2 };
        int n = arr.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}