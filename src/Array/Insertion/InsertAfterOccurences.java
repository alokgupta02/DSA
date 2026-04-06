package Array.Insertion;

public class InsertAfterOccurences {

    /*
     * Insert the value x after every occurrence of value y in the array.
     * If y appears multiple times, insert x after each occurrence.
     * Maintain the original relative order of elements.
     * Update the size of the array accordingly.
     */

    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int y = 20;
        int x = 99;
        int temp;

        System.out.print("Before insert : ");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        // logic
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == y) {
                temp = arr[i + 1];
                arr[i + 1] = x;
                arr[i + 2] = temp;
                i++;
            }
        }

        System.out.print("\nAfter insert : ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
