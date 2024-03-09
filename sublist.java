package ArrayList;

import java.util.ArrayList;

public class sublist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        
        int fromIndex = 1;
        int toIndex = 4; 
        
        ArrayList<Integer> subList = new ArrayList<>(arrayList.subList(fromIndex, toIndex));
        
        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Sublist: " + subList);
    }
}
