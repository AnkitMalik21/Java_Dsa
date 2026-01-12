package Practice.Hash;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * TreeMap
 * In TreeMap the keys are sort
 * put,get remove are O(logn)
 * Tree map used --->Red Black tree<---  for its implementation
 */
public class Hash05 {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("IND",500);
        map.put("US",100);
        map.put("GER",200);
        map.put("AUS",300);
        map.put("NZ",400);

        System.out.println(map);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("IND",500);
        hm.put("US",100);
        hm.put("GER",200);
        hm.put("AUS",300);
        hm.put("NZ",400);

        System.out.println(hm);
    }
}
