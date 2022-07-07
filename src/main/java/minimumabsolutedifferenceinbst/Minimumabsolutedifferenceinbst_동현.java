package minimumabsolutedifferenceinbst;

import ConvertSortedListtoBinarySearchTree.ConvertSortedListtoBinarySearchTree_동현;

import java.util.ArrayList;
import java.util.List;

import static ConvertSortedListtoBinarySearchTree.ConvertSortedListtoBinarySearchTree_동현.*;

// https://leetcode.com/problems/minimum-absolute-difference-in-bst/submissions/
public class Minimumabsolutedifferenceinbst_동현 {
    class Solution {
        public int getMinimumDifference(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            result = search(result, root);


            return find(result);
        }

        public List<Integer> search(List<Integer> result, TreeNode node) {
            if(node == null)
                return null;

//            result.add(node.val);
//            search(result,node.left);
//            search(result,node.right);
            return result;
        }

        public int find(List<Integer> result) {
            Integer min = null;
            for(int i=0; i<result.size(); i++) {
                for(int j=i+1; j<result.size(); j++) {
                    Integer sub = Math.abs(result.get(i) - result.get(j));
                    if(min == null)
                        min = sub;

                    if(min > sub)
                        min = sub;
                }
            }
            return min;
        }
    }
}
