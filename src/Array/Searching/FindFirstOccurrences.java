package Array.Searching;

public class FindFirstOccurrences {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 20};
        int x = 30;
        int n = 6;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        System.out.printf("first occurrences of %s is at %s", x, index);

    }
}
