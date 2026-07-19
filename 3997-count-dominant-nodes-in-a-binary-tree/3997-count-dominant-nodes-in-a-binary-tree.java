/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {

    private int count=0;
    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return count;
    }
    public int dfs(TreeNode root)
    {
       if(root==null)
       {
         return Integer.MIN_VALUE;
       } 
       int left=dfs(root.left);
       int right=dfs(root.right);

       int subtreeMax=Math.max(root.val,Math.max(left,right));

       if(root.val==subtreeMax)
       {
          //increase counter
          count=count+1;
       }
       return subtreeMax;
    }
}
/*class Solution {

    private int count=0;
    public int countDominantNodes(TreeNode root) {

       dfs(root);
       return count;  
    }
    public int dfs(TreeNode node)
    {
        if(node==null)
        {
            return Integer.MIN_VALUE;
        }
        int left=dfs(node.left);
        int right=dfs(node.right);

        int subtreeMax=Math.max(node.val,Math.max(left,right));
        if(node.val==subtreeMax)
        {
            count++;
        }
        return subtreeMax;
    } 
}*/