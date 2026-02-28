package Array.TwoPointer;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2, 9, 4, 3, 6, 7, 1, 6};
        int target = 12;

        int[] sumIndex = findSumIndex(arr, target);

        for (int a : sumIndex) {
            System.out.printf(a + " ");
        }

    }

    private static int[] findSumIndex(int[] arr, int target) {
        int n = arr.length;
        int[] sum = new int[2];
        for (int i = 0; i < n; i++) {
            int rem = target - arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] <= rem) {
                    if (arr[j] == rem) {
                        sum[0] = i;
                        sum[1] = j;
                        return sum;
                    }
                }
            }
        }
        return sum;
    }
}
