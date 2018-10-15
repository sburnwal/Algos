package demos.problems.basics;

import demos.util.Logger;

public class Stack {
	int[] data;
	int current;
	final int MAX;
	
	public Stack(int max) {
		this.current = -1;
		this.MAX = max;
		data = new int[MAX];
	}
	
	int pop() {
		if(current == -1) {
			throw new RuntimeException("Error: Cannot pop - stack is empty");
		}
		return data[current--];		//must post decrement
	}
	
	void push(int i) {
		if(current == MAX - 1) {
			throw new RuntimeException("Error - Cannot push - stack is full");
		}
		data[++current] = i;	//must do pre-increment
		Logger.log("Pushed " + i + " to the stack");
	}
}
