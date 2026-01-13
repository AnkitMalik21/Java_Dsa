package Practice.Hash;

import java.util.*;

public class Hash17 {

    // ---------- Node class ----------
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // ---------- Pair class ----------
    static class Pair {
        Node node;
        int level;

        Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    // ---------- Solution class ----------
    static class Solution {

        public ArrayList<Integer> bottomView(Node root) {
            ArrayList<Integer> res = new ArrayList<>();

            if (root == null)
                return res;

            Queue<Pair> q = new LinkedList<>();
            Stack<Pair> s = new Stack<>();
            TreeMap<Integer, Integer> map = new TreeMap<>();

            q.add(new Pair(root, 0));
            s.add(new Pair(root, 0));

            // BFS traversal
            while (!q.isEmpty()) {
                Pair p = q.remove();
                Node node = p.node;
                int level = p.level;

                if (node.left != null) {
                    q.add(new Pair(node.left, level - 1));
                    s.add(new Pair(node.left, level - 1));
                }

                if (node.right != null) {
                    q.add(new Pair(node.right, level + 1));
                    s.add(new Pair(node.right, level + 1));
                }
            }

            // Process stack to get bottom view
            while (!s.isEmpty()) {
                Pair p = s.pop();
                if (!map.containsKey(p.level)) {
                    map.put(p.level, p.node.data);
                }
            }

            // Collect result
            for (int val : map.values()) {
                res.add(val);
            }

            return res;
        }
    }

    // ---------- main method ----------
    public static void main(String[] args) {

        /*
                 20
               /    \
              8      22
             / \       \
            5   3       25
               / \
              10  14
        */

        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        Solution sol = new Solution();
        ArrayList<Integer> bottomView = sol.bottomView(root);

        System.out.println("Bottom View of Binary Tree:");
        System.out.println(bottomView);
    }
}
