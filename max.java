package ArrayList;

import java.util.ArrayList;

public class max {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(30);
        arrayList.add(20);
        arrayList.add(50);
        arrayList.add(40);
        
        int max = arrayList.get(0);
        

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        
        System.out.println("Maximum element in the ArrayList: " + max);
    }
}
