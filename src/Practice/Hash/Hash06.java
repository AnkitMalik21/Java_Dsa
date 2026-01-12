package Practice.Hash;

import java.util.HashMap;
import java.util.Set;

/**
 * Majority Element
 * Given an integer array of size n,
 * find all elements that appear more than n/3 times
 */
public class Hash06 {

    public static void main(String[] args) {
        int[] num  = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map = new HashMap<>();

        /**
         * for(int val : num){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }*/

        for(int val: num){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet){
            if(map.get(key)>num.length/3){
                System.out.println(key);
            }
        }
    }
}
