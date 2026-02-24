package Array.Searching;

public class FindSecondMax {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 9, 17, 16};
        int max, secondMax;
        int n = arr.length;

        if(arr[0]>arr[1]){
            max = arr[0];
            secondMax = arr[1];
        }else{
            max = arr[1];
            secondMax = arr[0];
        }

        for(int i=2; i<n;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]>secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
