package Strings;

public class ReverseString {

    public static void main(String[] args) {
        String word = "AI Agent";
        System.out.println(reverse(word));
    }

    private static String reverse(String word) {

        if(word.length() == 0) return "Empty input!";

        char[] chars = word.toCharArray();
        int left = 0;
        int right = chars.length-1;

        while(left<right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return chars.toString();
    }
}
