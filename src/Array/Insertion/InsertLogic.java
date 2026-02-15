package Array.Insertion;

public class InsertLogic {
    // shift elements rights and insert val at given k index
    public static void insert(int arr[], int n, int k, int val)
    {
        for(int i = n-1; i>=k;i--){
            arr[i+1] = arr[i];
        }

        arr[k] = val;

        System.out.print("array: ");
        for(int a : arr){
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int n = 4;
        int val = 99;
        int k = 2;
        insert(arr, n, k, val);
    }
}
