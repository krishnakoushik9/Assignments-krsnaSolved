package krsnaSolved.AdvancedDSA;

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
    public class Q1022 {
    public static TreeNode buildTree(int[] arr, int i) {
    if (i >= arr.length) return null;

    TreeNode root = new TreeNode(arr[i]);
    root.left = buildTree(arr, 2*i + 1);
    root.right = buildTree(arr, 2*i + 2);

    return root;
}
    public static int sumRootToLeaf(TreeNode root) {
        return DFS(root,0);
    }
    public static int DFS(TreeNode node, int sum){
        if(node == null){
            return 0;
        }
        sum = (sum << 1) + node.val;
        if(node.left == null && node.right == null){
            return sum;
        }
        return DFS(node.left,sum) + DFS(node.right,sum);
    }
//Main
    public static void main(String[] args) {
        int[] tree = {1,0,1,0,1,0,1};
        TreeNode root = buildTree(tree, 0);
        System.out.println(sumRootToLeaf(root));
    }

}
