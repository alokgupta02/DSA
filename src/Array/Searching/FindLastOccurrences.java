package Array.Searching;

public class FindLastOccurrences {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20, 60};
        int x = 20;
        int n = 7;
        int index = 0;

        for (int i = n - 1; i > 0; i--) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        System.out.printf("last occurrences of %s is at %s", x, index);
    }
}
