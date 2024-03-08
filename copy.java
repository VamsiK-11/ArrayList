package ArrayList;

import java.util.ArrayList;

public class copy {
    public static void main(String[] args) {
        ArrayList<Integer> sourceArrayList = new ArrayList<>();
        sourceArrayList.add(10);
        sourceArrayList.add(20);
        sourceArrayList.add(30);
        
        ArrayList<Integer> targetArrayList = new ArrayList<>(sourceArrayList);
        
        System.out.println("Target ArrayList: " + targetArrayList);
    }
}

