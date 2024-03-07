package ArrayList;

import java.util.ArrayList;

public class search {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        
        String searchElement = "Banana";
        if (arrayList.contains(searchElement)) {
            System.out.println(searchElement + " found in the array list.");
        } else {
            System.out.println(searchElement + " not found in the array list.");
        }
    }
}
