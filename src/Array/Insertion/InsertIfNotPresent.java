package Array.Insertion;

public class InsertIfNotPresent {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int n = 4;
        int x = 90;

        System.out.print("Before insert : ");
        for(int a : arr){
            System.out.print(a +" ");
        }

        //logic
        boolean isPresent = false;
        for(int i = n - 1; i >= 0 ;i--){
            if(arr[i]==x) {
                isPresent = true;
                break;
            }
        }

        if(!isPresent)
            arr[n] = x;


        System.out.print("\nAfter insert : ");
        for(int a : arr){
            System.out.print(a +" ");
        }
    }
}
