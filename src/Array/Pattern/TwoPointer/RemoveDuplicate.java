/**
 * Author: Alok Gupta
 * Date:13-03-2026
 * Time:00:44
 */
package Array.Pattern.TwoPointer;

// remove duplicate from sorted array
public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3 };

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        for (int a = 0; a < i + 1; a++)
            System.out.print(arr[a] + " ");
    }
}