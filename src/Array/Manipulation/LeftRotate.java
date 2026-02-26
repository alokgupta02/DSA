package Array.Manipulation;

public class LeftRotate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int val = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = val;

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
