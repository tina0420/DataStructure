package stack;

public class TraceRecord {
	
	class Node{
		int x;
		int y;
		Node next;
		public Node(int x,int y) {
			this.x=x;
			this.y=y;
			this.next=null;
		}
	}
	public class TraceRecord{
		public Node first;
		public Node last;
		public boolean isEmpty() {
			return first == null;
		}
	}
	public void insert(int x,int y) {
		Node newNode = new Node(x,y);
		if (this.)
	}
}
