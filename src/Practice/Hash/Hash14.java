package Practice.Hash;

import java.util.HashMap;
/**
 * Question is iterating cities
 Time Complexity for this code is linear
 */
public class Hash14 {

    public static String getStart(HashMap<String,String> ticket){
        HashMap<String,String> reverseMap = new HashMap<>();

        for(String key : ticket.keySet()){
            reverseMap.put(ticket.get(key),key);
        }

        for(String key : ticket.keySet()){
            if(!reverseMap.containsKey(key))
                return key; //starting point
        }

        return  null;
    }

    public static void main(String[] args) {
        HashMap<String,String> ticket = new HashMap<>();
        ticket.put("Chennai","Bengaluru");
        ticket.put("Mumbai","Delhi");
        ticket.put("Goa","Chennai");
        ticket.put("Delhi","Goa");

        String start = getStart(ticket);
        System.out.print(start);
        for(String key : ticket.keySet()){
            System.out.print(" -> " + ticket.get(start));
            start = ticket.get(start);
        }

        System.out.println();
    }
}
