package Practice.Hash;

import java.util.*;

public class Hash01 {
    public static void main(String[] args) {

        //Create
        HashMap<String,Integer> map = new HashMap<>();

        //Insert - O(1)
        map.put("IND",100);
        map.put("US",150);
        map.put("GER",200);

        System.out.println(map);

        //Get - O(1)
        int  population = map.get("IND");
        System.out.println(population);

        //if key doesn't exist return null
        System.out.println(map.get("IRE"));

        //ContainsKey - O(1)
        System.out.println(map.containsKey("IND"));
        System.out.println(map.containsKey("IRE"));

        //Remove
        System.out.println(map.remove("GER"));
        System.out.println(map);

        //size
        System.out.println(map.size());

        //Is empty
        System.out.println(map.isEmpty());

        //clear
        map.clear();
        System.out.println(map);
    }
}
