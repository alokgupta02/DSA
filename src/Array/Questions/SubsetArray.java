package Array.Questions;

public class SubsetArray {

    public static void main(String[] args) {
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};

        System.out.println(isSubset(a, b));

    }

    public static boolean isSubset(int[] a, int[] b) {
        // Your code here
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] != a[j])
                    return false;
                else{
                    break;
                }
            }
        }
        return true;
    }
}
