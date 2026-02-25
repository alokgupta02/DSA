package Array.Searching;

public class FindLargestElement {

    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90, 92};
        int n = arr.length;
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        System.out.printf("largest element : %s", max);
    }
}
