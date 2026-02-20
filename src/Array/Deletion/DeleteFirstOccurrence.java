package Array.Deletion;

public class DeleteFirstOccurrence {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 20, 50};
        int n = 5;
        int x = 20;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
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
}
