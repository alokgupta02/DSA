package Array;

import java.util.Arrays;

public class Insertion {
    int[] arr;

    public Insertion(int size){
        arr = new int[size];
        for(int i = 0; i<size;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int val){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = val;
                System.out.println("successfully inserted");
            }else{
                System.out.println("index is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index accessed");
        }
    }

    public static void main(String[] args) {
        Insertion obj = new Insertion(5);
        obj.insert(2, 3);
        obj.insert(6, 1);
        obj.insert(2, 3);
    }
}
