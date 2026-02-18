package Array.Deletion;

public class DeleteFirstElement {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40};
        int n = 4;

        for(int i = 0; i < n- 1; i++){
            arr[i] = arr[i+1];
        }
        n--;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
