package Practice.Hash;

import java.util.HashMap;

/**
 Valid Anagram
 two anagram are strings which are composed of main char by
  quantity in both the string

 forEach loop is not Applicable to type string
 */
public class Hash07 {
    public static boolean isAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);

            if(map.get(ch)!=null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }
        }

        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s = "race";
        String t = "care";

        System.out.println(isAnagram(s,t));
    }
}
