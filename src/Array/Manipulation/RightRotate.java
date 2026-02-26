package Array.Manipulation;

public class RightRotate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int val = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = val;

        for (int a : arr)
            System.out.print(a + " ");
    }
}
