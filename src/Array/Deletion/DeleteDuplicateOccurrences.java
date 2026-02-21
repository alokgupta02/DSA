package Array.Deletion;

public class DeleteDuplicateOccurrences {

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 3, 2, 1};
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            // Check if arr[i] appeared before
            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {

                    // Shift elements left
                    for (int k = i; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }

                    n--;     // reduce size
                    i--;     // re-check current index
                    break;   // exit inner loop
                }
            }
        }

        // Print updated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
