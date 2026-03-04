package Array.TwoPointer;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        //array unsorted
        int[] arr = {2, 9, 4, 3, 8, 6, 7, 1, 6};
        int target = 12;

        // bruteForce(arr, target);
        // better(arr, target);
        optimal(arr, target);
    }

    private static int[] bruteForce(int[] arr, int target) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    private static int[] better(int[] arr, int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }

    private static int[] optimal(int[] arr, int target){

        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            if(arr[left] + arr[right] > target){
                right--;
                continue;
            }else if(arr[left] + arr[right] < target){
                left++;
                continue;
            }
            if(arr[left] + arr[right] == target){
                return new int[]{arr[left],arr[right]};
            }
        }
        return new int[]{};
    }
}
