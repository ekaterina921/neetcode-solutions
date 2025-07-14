package solutions.trees;

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
}
