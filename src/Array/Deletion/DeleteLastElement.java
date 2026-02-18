package Array.Deletion;

public class DeleteLastElement {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40};
        int n = 4;

        if(n > 0){
            n--;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
