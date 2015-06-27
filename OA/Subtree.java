//http://www.lintcode.com/en/problem/subtree/#
//You have two every large binary trees: T1, with millions of nodes, and T2, with hundreds of nodes. Create an algorithm to decide if T2 is a subtree of T1.
public class Subtree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			this.val = x;
		}
	}
	
	public boolean isSubtree(TreeNode T1, TreeNode T2) {
        // write your code here
        if(T2 == null) {
            return true;
        } else if(T1 == null) {
            return false;
        } else {
            return isSametree(T1, T2) || isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
        }
       
    }
    
    public boolean isSametree(TreeNode T1, TreeNode T2) {
		if((T1 == null)^(T2 == null)) {
			return false;
		} else if(T1 == null && T2 == null){
			return true;
		}
		
		return (T1.val == T2.val) && isSametree(T1.left, T2.left) && isSametree(T1.right, T2.right);

	}
}