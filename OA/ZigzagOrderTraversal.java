public class ZigzagOrderTraversal {
	//Binary Tree Zigzag Level Order Traversal 
	//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) {
			return res;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		boolean order = true;
		
		while(!queue.isEmpty()) {
			List<Integer> list = new ArrayList<Integer>();
			int n = queue.size();
			for(int i = 0; i < n; i++) {
				TreeNode tmp = queue.poll();
				list.add(tmp.val);
				if(tmp.left != null) {
					queue.offer(tmp.left);
				}
				
				if(tmp.right != null) {
					queue.offer(tmp.right);
				}
			}
			
			if(order) {
				res.add(list);
			} else {
				res.add(reverse(list));
			}
			order = !order;
		}
		return res;
    }
    
    public List<Integer> reverse(List<Integer> list) {
		List<Integer> reverList = new ArrayList<Integer>();
		for(int i = list.size()-1; i >= 0; i--) {
			reverList.add(list.get(i));
		}
		
		return reverList;
	}
}