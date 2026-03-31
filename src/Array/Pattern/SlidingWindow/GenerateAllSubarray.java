package Array.Pattern.SlidingWindow;

public class GenerateAllSubarray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 0, 19 };
        int n = arr.length;

        for (int i = 0; i < n; i++) { // start index
            for (int j = i; j < n; j++) { // end index
                // print subarray from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
