package Practice.Hash;

import java.util.*;

//Iterating on Hash-Map
//there is no ordering of storing

public class Hash02 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("IND",100);
        map.put("GER",150);
        map.put("US",50);
        map.put("AUS",15);
        map.put("NZ",6);

        //Iterate
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for(String str : keys){
            System.out.println("Key = "+str+" value = "+map.get(str));
        }

        //entrySet
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //values
        for(Integer value : map.values()){
            System.out.println(value);
        }

        //foreach
        map.forEach((key,value)->{
            System.out.println(key + " " + value);
        });

        //it is the only way to delete item from hashMap
        Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());

            if(entry.getKey().equals("NZ")){
                it.remove();
            }
        }

        System.out.println(map);

    }
}
