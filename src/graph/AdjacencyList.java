package graph;

import java.io.IOException;

public class AdjacencyList {
	
	class Node{
		int x;
		Node next;
		public Node(int x) {
			x = this.x;
			this.next = null;
		}
	}
	class Graph{
		public Node first;
		public Node last;
		//是否為空
		public boolean isEmpty() {
			return first == null;
		}
		//print方法
		public void print() {
			Node current = first;
			while(current != null) {
				System.out.print("["+ current.x +"]");
				current = current.next;
			}
			System.out.println();
		}
		//insert方法
		public void insert(int x) {
			Node newNode = new Node(x);
			if(this.isEmpty()) {
				first = newNode;
				last = newNode;
			}else {
				last.next = newNode;
				last = newNode;
			}
		}
	}
	

	public static void main(String[] args) throws IOException{
		int data[][] = {{1,2},{2,1},{1,5},{5,1},{2,3},{3,2},{2,4},{4,2},
				{3,4},{4,3},{3,5},{5,3},{4,5},{5,4}};
		int number ;
		
		System.out.println("Adjacency List (鄰接串列) :");
		//多做一個存放的array
		Graph head[] = new Graph[6];
		for (int i=0; i<6; i++) {
			head[i] = new Graph();
			System.out.print("頂點"+i+"-->");
			for (int j=0;j<=13; j++) {
				if(data[j][0] == i) {
					head[i].insert(number);
				}
			}
			head[i].print();
		}
	}

}
