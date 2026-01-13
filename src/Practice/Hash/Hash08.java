package Practice.Hash;


import java.util.HashSet;

/**
 * SET - In math set is a collection of unique elements
 * HashSet
 * no duplicate only unique element
 * unordered
 * null is allowed
 * In java A hashSet is created using a HashMap
 * where key is the element itself,and value is random
 *
 *
 * Operations:
 *    - add(key)
 *    - contains(key)
 *    - remove(key)
 */
public class Hash08 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);

        System.out.println(set);

        if(set.contains(2)){
            System.out.println("Set contains 2");
        }

        set.remove(4);

        if(set.contains(4)){
            System.out.println("Set contains 4");
        }
    }
}
