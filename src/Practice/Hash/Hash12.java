package Practice.Hash;

//Count distinct element

import java.util.HashSet;

public class Hash12 {
    public static void main(String[] args) {
        int[] num = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set = new HashSet<>();

        for (int val : num) {
            set.add(val);
        }

        System.out.println(set.size());
    }
}
