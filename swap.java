package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class swap {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        
        System.out.println("Original ArrayList: " + arrayList);
        
        Collections.swap(arrayList, 1, 3);
        
        System.out.println("ArrayList after swapping: " + arrayList);
    }
}
