package Day08;

//938. Range Sum of BST

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int traverse(TreeNode node, int low, int high){
        int sum = 0;

        if(node == null){
            return 0;
        }

        if (node.val > low) {
            sum += traverse (node.left, low, high);
        }

        if(node.val <= high && node.val >= low){
            sum+=node.val;
        }

        if(node.val<high){
            sum += traverse (node.right, low, high);
        }

        return sum;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        return traverse (root, low, high);
    }
}
