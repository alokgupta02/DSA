package Array.Searching;

public class FindMaxAndMin {

    public static void main(String[] args) {
        int[] arr = {0,4,3,5,8,6};
        int n = arr.length;
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i<n;i++){
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.printf("Min is %s and Max is %s", min, max);
    }
}
