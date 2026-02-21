package Array.Searching;

public class FindSmallestElement {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 9};

        int smallestElement = arr[0];

        for (int a : arr) {
            if (a < smallestElement) {
                smallestElement = a;
            }
        }

        System.out.println(smallestElement);


    }
}
