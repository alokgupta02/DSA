package Array.Manipulation;

public class BitonicPoint {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        System.out.printf("Bitonic point is %d", findBitonicPoint(arr));

    }

    public static int findBitonicPoint(int[] arr) {
        int n = arr.length;
        int i = 1;
        int point = -1;

        while(i<n){
            if(arr[i]<arr[i-1]){
                point = arr[i-1];
                break;
            }else
                i++;
        }
        return point;
    }
}
