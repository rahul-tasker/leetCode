/***
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.

Example 1:
Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32

Example 2:
Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23

Runtime: 1 ms, faster than 53.10% of Java online submissions for Range Sum of BST.
Memory Usage: 45.6 MB, less than 97.67% of Java online submissions for Range Sum of BST.
***/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
        
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) return 0;
        else if(root.val >= L && root.val <= R) 
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        else 
            return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}