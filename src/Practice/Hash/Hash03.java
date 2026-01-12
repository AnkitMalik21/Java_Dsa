package Practice.Hash;


import java.util.*;
import java.util.LinkedList;

/**
 * it based on array of linked list
 * key->hash function -> bucket index
 * the worst complexity of hashMap is O(n)
 */
public class Hash03 {
    static class  HashMap<K,V>{

        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];//N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i=0;i<4;i++)
                this.buckets[i] = new LinkedList<>();
        }

        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];

            int di = 0;

            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }

                di++;
            }
            return -1;
        }

        private int hashFunction(K key){
             int hc = key.hashCode();
             return Math.abs(hc) % N; //remainder of anything divided 4 is always 0,1,2,3
        }

        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];

            N = N*2;
            for(int i=0;i< buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }

            //nodes -> add in bucket;
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.remove();
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key,V value){
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);// either valid or -1

            if(di !=-1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key,value));
                n++;
            }

            double lambda = (double) n/N;

            if(lambda >2.0){
                rehash();
            }
        }

        public boolean ContainsKey(K key){
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);

            if(di != -1){
                return true;
            }else{
                return  false;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];

                for(Node node : ll){
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }

    }

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("IND",100);
        map.put("GER",150);
        map.put("US",50);
        map.put("AUS",15);
        map.put("NZ",6);

        ArrayList<String> keys = map.keySet();
        for (String key: keys){
            System.out.println(key);
        }

        System.out.println(map.get("IND"));
        System.out.println(map.remove("NZ"));

        ArrayList<String> key1 = map.keySet();
        for (String key: key1){
            System.out.println(key);
        }
    }
}
