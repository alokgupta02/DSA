package Array.Questions;

public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        reverseArray(arr, n);
    }


    public static void reverseArray(int[] arr, int n){
        int left = 0;
        int right = n-1;
        int swap;

        while(left<right){
            swap = arr[left];
            arr[left] = arr[right];
            arr[right] = swap;
            left++;
            right--;
        }

        for(int a : arr){
            System.out.print(a +" ");
        }



    }
}
