package ArrayList;

import java.util.ArrayList;

public class merge {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(30);
        arrayList2.add(40);
        
        ArrayList<Integer> mergedList = new ArrayList<>(arrayList1);
        mergedList.addAll(arrayList2);
        
        System.out.println("Merged ArrayList: " + mergedList);
    }
}

