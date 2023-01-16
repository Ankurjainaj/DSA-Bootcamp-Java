package com.Ankur.LeetCode.DailyProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorder {
    //https://leetcode.com/problems/binary-tree-preorder-traversal/
    //https://leetcode.com/problems/same-tree

    /**
     * Definition for a binary tree node.
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> preorderTraversal1(TreeNode node) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> rights = new Stack<>();
        while (node != null) {
            list.add(node.val);
            if (node.right != null) {
                rights.push(node.right);
            }
            node = node.left;
            if (node == null && !rights.isEmpty()) {
                node = rights.pop();
            }
        }
        return list;
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }

    public void preOrder(TreeNode node, List<Integer> list) {
        if (node == null)
            return;

        list.add(node.val);
        preOrder(node.left, list);
        preOrder(node.right, list);

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
