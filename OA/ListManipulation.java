public class ListManipulation {
	private static class Node {
		int val;
		Node next;
		
		public Node(int x) {
			this.val = x;
			this.next = null;
		}
	}
	
	public static Node manipulate(Node head) {
		Node fastNode = head;
		Node slowNode = head;
		while(fastNode != null && fastNode.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
		}
		Node rightNode = fastNode == null ? slowNode : slowNode.next;
		
		Node leftNode = head; //left linkedlist
		while(rightNode != null) {
			Node leftTmp = leftNode.next;
			leftNode.next = rightNode;
			Node rightTmp =rightNode.next;
			rightNode.next = leftTmp;
			leftNode = leftTmp;
			rightNode = rightTmp;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = null;
		// d.next = e;
		// e.next = null;
		
		Node newNode = manipulate(a);
		System.out.println(newNode.val + ";" + newNode.next.val + ";" 
			+ newNode.next.next.val + ";" + newNode.next.next.next.val);
			// + ";" + newNode.next.next.next.next.val);
	}
}