package Array.Questions;

public class SpecialIntegers {

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,4};
        int n = arr.length;
        int count = 0;

        for(int i = 1; i < n - 1; i++){
            if(arr[i-1] == i && arr[i] == i+1 && arr[i+1] == i+2)
                count++;
        }
        System.out.println(count);
    }
}
