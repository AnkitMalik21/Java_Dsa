package Practice.Hash;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Iterator on HashSet
 * Iterator is an interface
 */
public class Hash09 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Gurugram");

        Iterator<String> it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(String str:cities){
            System.out.println(str);
        }
    }
}
