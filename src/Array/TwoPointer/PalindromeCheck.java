package Array.TwoPointer;

public class PalindromeCheck {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1};
        int size = arr.length;
        System.out.println(isPalindrome(arr, size));
    }

    public static boolean isPalindrome(int[] arr, int n) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
