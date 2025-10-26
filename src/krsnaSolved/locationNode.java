//package krsnaSolved;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(int x) {
//        val = x;
//        left = null;
//        right = null;
//    }
//}
//
//public class locationNode {
//
//    public boolean getPath(TreeNode root, List<Integer> arr, int x) {
//        if (root == null) {
//            return false;
//        }
//        arr.add(root.val);
//        if (root.val == x) {
//            return true;
//        }
//        if (getPath(root.left, arr, x) || getPath(root.right, arr, x)) {
//            return true;
//        }
//        arr.removeLast();
//        return false;
//    }
//
//    public List<Integer> solve(TreeNode A, int B) {
//        List<Integer> arr = new ArrayList<>();
//        if (A == null) {
//            return arr;
//        }
//        getPath(A, arr, B);
//        return arr;
//    }
//
//
//    public static void main(String[] args) {
//
//    }
//}
