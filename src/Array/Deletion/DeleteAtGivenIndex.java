package Array.Deletion;

public class DeleteAtGivenIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        int n = 5;
        int x = 20;

        for(int i = 0; i<=n-1; i++){
            if(arr[i]==x){
                for(int j = i; j < n-1; j++){
                    arr[j] = arr[j+1];
                }
                n--;
                break;

            }
        }


        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
