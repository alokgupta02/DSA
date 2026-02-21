package Array.Deletion;

public class DeleteGreaterElement {

    public static void main(String[] args) {

        deleteFromUnsorted();
        deleteFromSorted();
        deleteAllFromUnsorted();
        deleteAllFromSorted();
    }

    private static void deleteAllFromSorted() {
        int[] arr = {1, 3, 5, 7, 9};
        int n = 5;
        int x = 5;
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            n = index;
        } else {
            System.out.println("No greater element is found!");
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void deleteAllFromUnsorted() {
        int[] arr = {6, 7, 8};
        int n = 3;
        int x = 3;

        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
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

    private static void deleteFromSorted() {
        int[] arr = {2, 4, 6, 8};
        int n = 4;
        int x = 1;
        int index = -1;

        //find index
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > x) {
                index = i;
                break;
            }
        }

        //shift element
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void deleteFromUnsorted() {
        int[] arr = {4, 3, 5, 5, 1, 5};
        int n = 6;
        int x = 5;
        int index = -1;

        // find index of first occurrence of element>x
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > x) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.printf("No element is greater than %s is found", x);
            return;
        }


        // shift element
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}