package Array.Insertion;

public class InsertAfterValue {

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int n = 4;
        int k = 30;
        int val = 99;

        System.out.print("Before insert : ");
        for(int a : arr){
            System.out.print(a +" ");
        }

        // logic
        // find the index of k
        int index = -1;
        for(int i = 0; i<n;i++){
            if(arr[i]==k) {
                index = i;
                break;
            }
        }

        // shift element till index+1
        for(int i = n-1; i>index;i--){
            arr[i+1] = arr[i];
        }

        // insert val
        arr[index+1] = val;

        System.out.print("\nAfter insert : ");
        for(int a : arr){
            System.out.print(a +" ");
        }
    }
}
