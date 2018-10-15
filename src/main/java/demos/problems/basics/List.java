package demos.problems.basics;

import demos.util.Logger;

public class List {
	Node front = null;
	
	public Node front() {
		return this.front;
	}
	
	public Node reverseIterative() {
		if(front == null || front.next == null) {
			return front;
		}
		
		Node current = front;
		Node prev = null;
		
		while(current != null) {
			Node temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		
		//previous points to the first element now
		this.front = prev;
		return prev;
	}
	
	public void add(int i) {
		if(front == null) {
			front = new Node(i);
		} else {
			Node n = front;
			while(n.next != null) {
				n = n.next;
			}
			
			//reached end 
			Node newNode = new Node(i);
			n.next = newNode;
		}
		
		Logger.log("Added node " + i);
	}
	
	public String printList() {
		StringBuilder s = new StringBuilder();
		Node n = front;
		while(n != null) {
			s.append(n.data + " ");
			n = n.next;
		}
		
		return s.toString();
	}
	
	static class Node {
		int data;
		Node next;
		
		Node(int p) {
			this.data = p;
		}
	}
}
