package List;

import java.util.ArrayList;
import java.util.List;

public class SwapKElement {

    public static void main(String[] args) {
        // creating ArrayList
        List<Integer> my_list = new ArrayList<>();
        my_list.add(10);
        my_list.add(20);
        my_list.add(30);
        my_list.add(40);
        my_list.add(50);
        my_list.add(60);
        my_list.add(70);
        my_list.add(80);
        int k = 3;
        //op = {10,20,60,40,50,30,70,80}

        int n = my_list.size();
        int temp = my_list.get(k-1);
        int swap = n - k;

        my_list.set(k-1,my_list.get(swap));
        my_list.set(swap,temp);

        for(int a : my_list)
            System.out.printf(a +" ");

    }
}
