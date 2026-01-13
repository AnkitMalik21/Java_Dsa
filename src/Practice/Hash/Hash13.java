package Practice.Hash;

import java.util.HashSet;

//union and intersection of 2 Arrays
public class Hash13 {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();

        //UNION
        for(int val : arr1){
            set.add(val);
        }

        for(int val : arr2){
            set.add(val);
        }
        System.out.print("The element in the union are ");
        for (int x: set){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("The size of union is " + set.size());

        //Intersection

        set.clear();
        int count =0;
        for(int val : arr1){
            set.add(val);
        }

        System.out.print("The intersection elements are ");

        for(int val:arr2){
            if(set.contains(val)){
                count++;
                System.out.print(val + " ");
                set.remove(val);
            }
        }
        System.out.println();

        System.out.println("The size of intersection is "+ count);
    }
}
