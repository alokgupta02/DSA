package Array.Deletion;

public class DeleteMultiOccurrence {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 20};
        int n = 6;
        int x = 20;

        for(int i = 0; i < n; i++) {

            if(arr[i] == x) {

                // Shift elements left
                for(int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }

                n--;      // Reduce size
                i--;      // Stay at same index
            }
        }

// Print updated array
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
