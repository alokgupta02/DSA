package Array;

public class MultiplyLeftAndRight {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(multiply(arr));
    }

    public static int multiply(int[] arr) {

        int a = 0;
        int b = 0;
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            a += arr[i];
        }

        for (int i = n / 2; i < n; i++) {
            b += arr[i];
        }

        return a * b;
    }
}
