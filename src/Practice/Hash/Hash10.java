package Practice.Hash;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 *LINKED HASHSET
 *It is ordered using Doubly Linked List
 */
public class Hash10{
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);

        LinkedHashSet<String>  set = new LinkedHashSet<>();
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Noida");
        set.add("Bengaluru");
        System.out.println(set);

        set.remove("Delhi");
        System.out.println(set);
    }
}
