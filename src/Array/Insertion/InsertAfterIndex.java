package Array.Insertion;

public class InsertAfterIndex {

    // Insert After Given Index

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int n = 4;
        int k = 2;
        int val = 99;

        System.out.print("Before insert : ");
        for(int a : arr){
            System.out.print(a +" ");
        }

        for(int i = n-1;i>k;i--){
            arr[i+1] = arr[i];
        }

        arr[k+1] = val;

        System.out.print("\nAfter insert : ");
        for(int a : arr){
            System.out.print(a +" ");
        }

    }
}
