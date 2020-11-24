package stack;

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

public class TraceRecord {
	public Node first;
	public Node last;
	public boolean isEmpty() {
		return first == null;
	}
	
	//打點加入stack
	public void insert(int x, int y) {
		Node newNode = new Node(x,y);
		if(this.isEmpty()) {
			first = newNode;
			last = newNode;
		}else {
			last.next = newNode;
			last = newNode;
		}
	}

	//把點從stack刪除
	public void delete(int x, int y) {
		Node newNode = new Node(x,y);
		if(this.isEmpty()) {
			System.out.println("stack已經空了");
			return;
		}
		newNode = first;
		while(first.next != last) {
			newNode = newNode.next;
		}
		first.next = last.next;
		last = newNode;
	}
}
