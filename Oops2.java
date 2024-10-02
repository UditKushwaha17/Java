

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(2, "Orange");
        hm.put(4, "Orange");
        hm.put(1, "Apple");
        hm.put(3, "Mango");
        
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);

        System.out.println(set);
    }
}
