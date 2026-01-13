package Practice.Hash;

import java.util.HashMap;
import java.util.Map;

/**
 * Question -> the largest subarray with sum 0
 * using the property of prefix sum
 * sum[i+1,j] = sum[0,j] - sum[0,i]
 * sum[j] - sum[i] = 0
 */
public class Hash15 {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10,23};
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;

        for(int j=0; j<arr.length; j++){
            sum += arr[j];

            if(map.containsKey(sum)){
                  len = Math.max(len, j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }

        System.out.println("The size of largest subArray with sum 0 is " + len);
    }
}
