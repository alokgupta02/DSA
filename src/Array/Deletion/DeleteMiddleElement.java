package Array.Deletion;

public class DeleteMiddleElement {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int n = 4;
        int mid;

        // find middle
        mid = n/2;

        // shift from mid
        for(int i = mid; i< n-1; i++){
            arr[i] = arr[i+1];
        }
        n--;


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
