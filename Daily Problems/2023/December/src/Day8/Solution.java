package Day8;
//606. Construct String from Binary Tree

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
    String result = "";
    public String tree2str(TreeNode root) {
        return dfs(root);
    }

    public String dfs(TreeNode root){

        if (root == null) return result;
        result+=Integer.toString(root.val);

        if (root.left == null && root.right == null)    return result;

        result+=("(");
        dfs(root.left);
        result+=(")");
        if (root.right != null){
            result+=("(");
            dfs(root.right);
            result+=(")");
        }
        return result;
    }
}