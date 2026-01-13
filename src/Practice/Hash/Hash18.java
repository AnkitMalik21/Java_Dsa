package Practice.Hash;

import java.util.*;

public class Hash18 {

    // ---------- Solution class ----------
    static class Solution {
        boolean twoSum(int[] arr, int target) {
            HashSet<Integer> set = new HashSet<>();

            for (int num : arr) {
                int required = target - num;

                if (set.contains(required)) {
                    return true;
                }

                set.add(num);
            }
            return false;
        }
    }

    // ---------- main method ----------
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] arr1 = {0, -1, 2, -3, 1};
        int target1 = -2;
        System.out.println("Output 1: " + sol.twoSum(arr1, target1)); // true

        int[] arr2 = {1, -2, 1, 0, 5};
        int target2 = 0;
        System.out.println("Output 2: " + sol.twoSum(arr2, target2)); // false

        int[] arr3 = {11};
        int target3 = 11;
        System.out.println("Output 3: " + sol.twoSum(arr3, target3)); // false
    }
}
