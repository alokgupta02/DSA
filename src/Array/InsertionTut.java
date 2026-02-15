package Array;

public class InsertionTut {
    int[] arr;

    public InsertionTut(int size){
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
        InsertionTut obj = new InsertionTut(5);
        obj.insert(2, 3);
        obj.insert(6, 1);
        obj.insert(2, 3);
    }
}
