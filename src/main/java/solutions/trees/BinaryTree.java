package solutions.trees;

import java.util.*;

public class BinaryTree {
    int val;
    BinaryTree rightNode;
    BinaryTree leftNode;
    public BinaryTree(){}
    public BinaryTree(int val) {this.val = val;}
    public BinaryTree(int val, BinaryTree right, BinaryTree left){
        this.val = val;
        this.rightNode = right;
        this.leftNode = left;
    }

    public BinaryTree buildTree(Integer[] values) {
        if (values == null || values.length == 0 || values[0] == null) {
            return null;
        }

        BinaryTree root = new BinaryTree(values[0]);
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < values.length) {
            BinaryTree current = queue.poll();

            // Left child
            if (i < values.length && values[i] != null) {
                current.leftNode = new BinaryTree(values[i]);
                queue.add(current.leftNode);
            }
            i++;

            // Right child
            if (i < values.length && values[i] != null) {
                current.rightNode = new BinaryTree(values[i]);
                queue.add(current.rightNode);
            }
            i++;
        }
        return root;
    }


// Depth first search; Time complexity = O(n); Space complexity = O(n)

    public static BinaryTree invertTree (BinaryTree root) {
        if (root == null){
            return null;
        }
        BinaryTree temp = root.leftNode;
        root.leftNode = root.rightNode;
        root.rightNode = temp;

        invertTree(root.leftNode);
        invertTree(root.rightNode);
        return root;
    }

    public static int maxDepthRecursion(BinaryTree root){
        if (root == null) return 0;
        return 1 + Math.max(maxDepthRecursion(root.leftNode), maxDepthRecursion(root.rightNode));
    }

    public static int maxDepthBFS(BinaryTree root){
        Queue<BinaryTree> queue = new LinkedList<>();
        if (root != null) queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                BinaryTree node = queue.poll();
                if(node.leftNode != null) queue.add(node.leftNode);
                if (node.rightNode != null) queue.add(node.rightNode);
            }
            level++;
        }
        return level;
    }

    public int maxDepthDFS(BinaryTree root) {
        Stack<Map.Entry<BinaryTree, Integer>> stack = new Stack<>();
        stack.push(new AbstractMap.SimpleImmutableEntry<>(root, 1));
        int res = 0;

        while (!stack.isEmpty()) {
            Map.Entry<BinaryTree, Integer> current = stack.pop();
            BinaryTree node = current.getKey();
            int depth = current.getValue();

            if (node != null) {
                res = Math.max(res, depth);
                stack.push(new AbstractMap.SimpleImmutableEntry<>(node.leftNode, depth + 1));
                stack.push(new AbstractMap.SimpleImmutableEntry<>(node.rightNode, depth + 1));
            }
        }

        return res;
    }
}
