package Array.Pattern.PrefixSum;

public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int[] pref = makePrefixSum(arr);
        System.out.println(pref);
    }

    private static int[] makePrefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }
}
