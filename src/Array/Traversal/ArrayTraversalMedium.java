package Array.Traversal;

public class ArrayTraversalMedium {

    public static void main(String[] args) {
        int[] arr = {4, 66, 2, 1, 65, 88, 7, 9, 6, 85};
        //int[] arr = {3,4,5,1,2};

        //Second Largest Element
        int max = arr[0];
        int secondMax = 0;
        for(int i = 1; i<arr.length; i++){
            System.out.println(arr[i]);
            if(max<arr[i]){
                secondMax = max;
                max = arr[i];
            }
            if(max<arr[i] && secondMax>arr[i]){
                secondMax = arr[i];
            }
        }
        System.out.printf("2nd largest element is %s %n", secondMax);



    }
}
