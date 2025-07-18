package solutions.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTest {
    public static BinaryTree invertBinaryTreeTest(BinaryTree root){
        if (root == null) return null;

        BinaryTree temp = root.leftNode;
        root.leftNode = root.rightNode;
        root.rightNode = temp;

        BinaryTree.invertTree(root.leftNode);
        BinaryTree.invertTree(root.rightNode);

        return root;
    }

    public  static int maxDepthRecursionTest(BinaryTree root){
        if (root == null) return 0;
        return 1 + Math.max(maxDepthRecursionTest(root.leftNode), maxDepthRecursionTest(root.rightNode));
    }

    public static int maxDepthBFSTest(BinaryTree root){
        Queue<BinaryTree> queue = new LinkedList<>();
        if (root != null) queue.add(root);
        int level = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
               BinaryTree node = queue.poll();
               if(node.leftNode != null) queue.add(node.leftNode);
               if(node.rightNode != null) queue.add(node.rightNode);
            }
            level++;
        }
        return level;
    }
}
