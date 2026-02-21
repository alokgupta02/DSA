package Array.Searching;

public class LinearSearching {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int x = 20;
        int n = 4;
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.printf("index of %s is %s ", x, index);
        }
    }
}
