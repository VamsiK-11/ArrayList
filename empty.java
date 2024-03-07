package ArrayList;

import java.util.ArrayList;

public class empty {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Hello");
        
        System.out.println("ArrayList1 is empty: " + arrayList1.isEmpty());
        System.out.println("ArrayList2 is empty: " + arrayList2.isEmpty());
    }
}
