package Array.Pattern.PrefixSum;

public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 5, 8 };

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }
}
