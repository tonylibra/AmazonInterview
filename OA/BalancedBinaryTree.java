public class BalancedBinaryTree {
	public static void main(String[] args) {
		
	}
	
	public boolean isBalanced(TreeNode root) {
		return maxDepth(root) != -1;
	}
	
	public int maxDepth(TreeNode node) {
		if(node == null) {
			return 0;
		}
		
		int left = maxDepth(node.left);
		int right = maxDepth(node.right);
		
		if(left == -1 || right  == -1 || Math.abs(left - right) > 1) {
			return -1;
		}
		
		return Math.max(left, right) + 1;
	}
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int x) {
			this.val = x;
		}
	}
}