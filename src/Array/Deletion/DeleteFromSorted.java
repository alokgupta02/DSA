package Array.Deletion;

public class DeleteFromSorted {

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 20, 30, 50};
        int n = 6;
        int x = 20;

        int firstIndex = -1;
        int lastIndex = -1;

        // Find first occurrence
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                firstIndex = i;
                break;
            }
        }

        if (firstIndex == -1) {
            System.out.println("Value not found");
            return;
        }

        // Find last occurrence
        for (int i = firstIndex; i < n; i++) {
            if (arr[i] != x) {
                lastIndex = i - 1;
                break;
            }
            if (i == n - 1) {
                lastIndex = i;
            }
        }

        // Number of elements to delete
        int count = lastIndex - firstIndex + 1;

        // Shift elements left
        for (int i = firstIndex; i + count < n; i++) {
            arr[i] = arr[i + count];
        }

        n = n - count;

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}