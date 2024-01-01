package Day09;
//94. Binary Tree Inorder Traversal.
import java.util.ArrayList;
import java.util.List;

//Definition for a binary tree node.
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

    public void inorder (List<Integer>l, TreeNode t){
        if (t == null) return;
        inorder(l,t.left);
        l.add(t.val);
        inorder(l, t.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> list = new ArrayList<>();
        inorder(list,root);
        return list;
    }
}