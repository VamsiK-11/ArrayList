package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        
        System.out.println("Original ArrayList: " + arrayList);
        
        Collections.reverse(arrayList);
        
        System.out.println("Reversed ArrayList: " + arrayList);
    }
}
