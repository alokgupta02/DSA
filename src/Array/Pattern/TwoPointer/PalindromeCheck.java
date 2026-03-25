package Array.Pattern.TwoPointer;

public class PalindromeCheck {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 2, 1 };
        String str = "A man, a plan, a canal: Panama";

        // System.out.println(isPalindromeInt(arr));
        System.out.println(isPalindromeString(str));
    }

    public static boolean isPalindromeInt(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeString(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric on left
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            // Skip non-alphanumeric on right
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            // Compare lowercase versions
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
