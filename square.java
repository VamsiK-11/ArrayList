package ArrayList;

import java.util.ArrayList;

public class square {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        
        for (int i = 0; i < arrayList.size(); i++) {
            int squared = arrayList.get(i) * arrayList.get(i);
            arrayList.set(i, squared);
        }
        
        System.out.println("ArrayList after squaring each element: " + arrayList);
    }
}
