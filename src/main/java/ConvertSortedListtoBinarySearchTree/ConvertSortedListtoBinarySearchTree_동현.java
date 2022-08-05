package ConvertSortedListtoBinarySearchTree;
// https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertSortedListtoBinarySearchTree_동현 {
    
     public static void main(String[] args) {
          Solution solution = new Solution();
         ListNode listNode = new ListNode(-10,
                 new ListNode(-3,
                         new ListNode(0,
                                 new ListNode(5,
                                         new ListNode(9)))));
         
         assertThat(solution.sortedListToBST(listNode)).isEqualTo(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
         
     }


    static class Solution {
        public TreeNode insert(ArrayList<Integer> a, int start, int end) {
            if (start > end) {
                return null;
            }

            int mid = (start + end) / 2;
            TreeNode root = new TreeNode(a.get(mid));
            root.left = insert(a, start, mid - 1);
            root.right = insert(a, mid + 1, end);

            return root;
        }

        public TreeNode sortedListToBST(ListNode head) {
            ArrayList<Integer> a = new ArrayList<>();

            while (head!= null) {
                a.add(head.val);
                head = head.next;
            }

            return insert(a, 0, a.size()-1);

        }
    }


    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    // Definition for a binary tree node.
    public static class TreeNode {
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
}
