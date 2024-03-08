package ArrayList;

import java.util.ArrayList;

public class index {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        
        String elementToFind = "Banana";
        int index = arrayList.indexOf(elementToFind);
        
        if (index != -1) {
            System.out.println("Index of " + elementToFind + ": " + index);
        } else {
            System.out.println(elementToFind + " not found in the ArrayList.");
        }
    }
}
