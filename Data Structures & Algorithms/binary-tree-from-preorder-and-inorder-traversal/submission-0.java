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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> hashInorder = new HashMap<>();

        for(int i=0; i<inorder.length; i++) {
            hashInorder.put(inorder[i],i);
        }

        return helper(0,preorder.length-1,0,preorder.length-1,preorder,hashInorder);       
        
    }

    private TreeNode helper(int preStart, int preEnd, int inStart, int inEnd,
    int[] preorder, Map<Integer,Integer> hashInorder) {
        if(preStart>preEnd || inStart>inEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int inRootIdx = hashInorder.get(root.val);
        int leftSubTree = inRootIdx-inStart;

        root.left = helper(preStart+1, preStart+leftSubTree, inStart,
        inRootIdx-1, preorder, hashInorder);

        root.right = helper(preStart+leftSubTree+1, preEnd, inRootIdx+1,
        inEnd, preorder, hashInorder);

        return root;
    }
}
