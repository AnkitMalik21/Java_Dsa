package Practice.Hash;

import java.util.HashMap;
import java.util.LinkedHashMap;

//LinkedHashMap
//keys are in insertion order
public class Hash04 {
    public static void main(String[] args) {
        LinkedHashMap<String ,Integer> map  = new LinkedHashMap<>();
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

        //In the output the ans is ordering of key is different
        //LinkedHashMap uses doubly linked list for its implementation
    }
}
