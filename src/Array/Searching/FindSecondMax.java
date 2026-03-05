package Array.Searching;

public class FindSecondMax {

    public static void main(String[] args) {
        int[] arr = {10, 10, 10};
        getSecondLargest(arr);
    }

    private static int getSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        if (second == Integer.MIN_VALUE) {
            return -1;
        }
        return second;
    }
}
