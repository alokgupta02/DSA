package Array;

public class ElementInRange {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 7, 8, 3};
        int a = 2;
        int b = 5;
        int n = 7;
        check_elements(arr, n, a, b);
    }

    private static boolean check_elements(int[] arr, int n, int a, int b) {

        int range_size = b - a + 1;
        int[] range = new int[]{range_size};

        for (int i = 0; a <= b; a++, i++) {
            range[i] = a;
            System.out.println(range[i]);
        }

        return true;
    }
}
