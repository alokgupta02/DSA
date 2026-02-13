package Array.Traversal;

public class ArrayTraversal {

    public static void main(String[] args) {
        int[] arr = {4, 66, 2, 1, 65, 8, 7, 9, 6, 85};
        //int[] arr = {1,2,3,4,5};

        //Print All Elements
        for(int a: arr){
            System.out.print(a+" ");
        }
        System.out.println();

        //Print in Reverse Order
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //Count Elements
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            count ++;
        }
        System.out.printf("count : %d \n", count);

        // Sum of All Elements
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        System.out.println("sum: "+sum);

        //Count Even Numbers
        int even = 0;
        for(int a : arr){
            if(a %2 == 0)
                even++;
        }
        System.out.println("even count : "+even);

        //Find Maximum Element
        int max = arr[0];
        for(int a : arr){
            if(a>max)
                max = a;
        }
        System.out.println("max : "+max);

        //Find Index of Largest Element
        int index = 0;
        int largest = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>=largest){
                largest = arr[i];
                index = i;
            }
        }
        System.out.println("index of a largest element : "+index);

        //Count Frequency of Given Element
        int x = 6;
        int frequency = 0;

        for(int a : arr){
            if(a == x){
                frequency++;
            }
        }
        System.out.printf("Frequency of %s = %d %n", x, frequency);

        //Check if Array Contains Duplicate
        boolean containsDuplicate = false;
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    containsDuplicate = true;
                    break;
                }
            }
        }
        System.out.printf("array contains duplicate: %s %n", containsDuplicate);

        //Check if Array is Sorted (Ascending)
        boolean isSorted = true;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Is array sorted: " + isSorted);
    }
}
