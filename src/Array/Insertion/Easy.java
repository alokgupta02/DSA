package Array.Insertion;

public class Easy {

    public static void main(String[] args) {

        // 1. Insert at End
        int[] arr = {1,2,3,4,0};
        int[] arr1 = {1,2,3};
        int n = 5;

        arr[arr.length-1] = n;
        System.out.print("after insert : ");
        for(int a : arr){
            System.out.print(a+ " ");
        }

        // 2. Insert at Beginning
        int[] arr2 = new int[4];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        int newValue = 5;

        for(int i = arr2.length - 2; i >= 0; i--) {
            arr2[i + 1] = arr2[i];
        }
        arr2[0] = newValue;
        System.out.print("\narray : ");
        for(int a : arr2){
            System.out.print(a+" ");
        }

        // 3. Insert at Given Index

    }
}
