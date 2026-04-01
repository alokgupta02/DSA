package Array.Pattern.SlidingWindow;

public class GetElementsByK {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 2, 3, 7, 3, 7, 6 };
        int k = 3;
        int n = arr.length;
        int i = 0;

        while (i <= n - k) {
            for (int j = i; j < i + k; j++) {
                System.out.print(arr[j]);
            }
            i++;
            System.out.println();
        }
    }
}