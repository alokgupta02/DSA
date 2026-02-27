package Array.Manipulation;

public class WaveArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i++;
        }

        for(int a : arr){
            System.out.printf(a + " ");
        }
    }

}
