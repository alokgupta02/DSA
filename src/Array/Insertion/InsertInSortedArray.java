package Array.Insertion;

public class InsertInSortedArray {

    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int n = 4;
        int k = 25;

        System.out.print("Before insert : ");
        for(int a : arr){
            System.out.print(a +" ");
        }

        // logic

        for(int i=n-1;i<n;i--){
            if(arr[i+1]>k){
                arr[i+1] = arr[i];
            }else
                arr[i+1] = k;
        }

        System.out.print("\nAfter insert : ");
        for(int a : arr){
            System.out.print(a +" ");
        }
    }
}
