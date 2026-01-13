package Practice.Hash;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 TREESET
 Sorted in ascending order
 NULL values are not allowed
 TREESET <--- TREEMAP <---- REDBLACK TREE
 HashSet,LinkedHashSet allow null value
 Time Complexity is O(logn) because of internal sorting
 */
public class Hash11 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Noida");
        set.add("Bengaluru");
        System.out.println(set);

        TreeSet<String> tree = new TreeSet<>();
        tree.add("Delhi");
        tree.add("Mumbai");
        tree.add("Noida");
        tree.add("Bengaluru");
        System.out.println(tree);
    }
}
