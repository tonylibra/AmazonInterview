//http://www.lintcode.com/en/problem/lowest-common-ancestor/
public class CommonAncestor {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
		TreeNode left = null;
		TreeNode right = null;
		
		if(root == null) {
			return null;
		}
		
		if(root == A || root == B) {
			return root;
		}
		
		left = lowestCommonAncestor(root.left, A, B);
		right = lowestCommonAncestor(root.right, A, B);
		
		if(left != null && right != null) {
			return root;
		}
		
		return (left != null) ? left : right;
	}
}