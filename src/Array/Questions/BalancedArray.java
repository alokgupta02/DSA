package Array.Questions;

public class BalancedArray {
    public static void main(String[] args) {


        int[] arr = {1, 2, 1, 2, 1, 3};
        int n = arr.length;
        int a = 0;
        int b = 0;

        for (int i = 0; i < n / 2; i++) {
            a += arr[i];
        }

        for (int i = n / 2; i < n; i++) {
            b += arr[i];
        }
        System.out.println(Math.abs(a-b));
    }
}
