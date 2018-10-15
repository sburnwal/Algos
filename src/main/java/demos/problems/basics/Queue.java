package demos.problems.basics;

import demos.util.Logger;

/**
 * N1 -> N2 -> N3 -> N4 -> N5
 * |						|
 * head				   	   tail
 * 
 * @author sburnwal
 */
public class Queue {
	Node head, tail;
	
	public Queue() {
		this.head = null;
		this.tail = null;
	}

	//appends the data at the end
	public void add(int data) {
		if(tail == null) {
			Node node = new Node(data);
			node.next = null;
			
			this.head = node;
			this.tail = node;
		} else {
			Node node = new Node(data);
			this.tail.next = node;
			this.tail = node;
		}
		Logger.log("Added node[" + data + "] to the queue");
	}

	//removes the head of queue
	public int remove() {
		if(head == null) {
			throw new RuntimeException("Error - cannot remove - queue empty");
		} else {
			Node n = this.head;
			this.head = n.next;
			
			n.next = null;
			Logger.log("Removed front node[" + n.data + "] from the queue");
			return n.data;
		}
	}
	
	//just checks if the queue has elements
	public boolean hasElements() {
		return (head != null);
	}
	
	//print the queue
	public String printQueue() {
		StringBuilder s = new StringBuilder();
		Node n = head;
		while(n != null) {
			s.append(n.data + " ");
			n = n.next;
		}
		
		return s.toString();
	}
	
	public Node head() {
		return this.head;
	}
	
	public Node tail() {
		return this.tail;
	}
	
	/* Reverse the queue iteratively */   
	public void reverseIterative() {
		Node orgHead = this.head;
		Node orgTail = this.tail;
		
		if(head == null) {
			Logger.log("Error - queue is empty");
			return;
		}
		
		if(this.head == this.tail) {	//just one element in queue 
			Logger.log("No-op: queue has just one element");
			return;
		}

		Node current = head;
		Node previous = null;

		while(current != null) {
			/* This sequence of statements is very important */
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		//Where is the head now ? 
		this.head = previous;
		this.tail = orgHead;
	}
	
	static class Node {
		private Node next;
		private int data;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
}