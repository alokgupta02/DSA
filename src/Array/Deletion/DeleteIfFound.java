package Array.Deletion;

public class DeleteIfFound {

    public static void main(String[] args) {
        deleteFirst();
        deleteMulti();
    }

    public static void deleteFirst() {
        // delete 1st occurrences
        int[] arr = new int[] { 10, 20, 30, 20, 50 };
        int n = 5;
        int x = 20;
        int index = 0;

        // find index
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        // shift element
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void deleteMulti() {
        // Delete multi occurrences
        int[] arr = new int[] { 10, 20, 30, 20, 50 };
        int n = 5;
        int x = 20;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                i--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
