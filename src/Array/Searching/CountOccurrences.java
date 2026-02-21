package Array.Searching;

public class CountOccurrences {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 20};
        int x = 20;
        int n = 6;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        System.out.println("count : " + count);
    }
}
