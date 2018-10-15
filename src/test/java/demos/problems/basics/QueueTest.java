package demos.problems.basics;

import java.util.StringTokenizer;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demos.problems.basics.Queue;
import demos.util.Logger;

public class QueueTest {
	int[] elements = null;
	
	@BeforeTest
	public void setup() {
		elements = new int[] {20, 75, 65, 30, 45};
	}
	
	@Test
	public void testPrintQueue() {
		Logger.log("################## testPrintQueue() ...");
		Queue q = new Queue();
		
		for(int i : elements) {
			q.add(i);
		}
		
		String s = q.printQueue();
		Logger.log("Queue is " + s);
		
		StringTokenizer st = new StringTokenizer(s, " ");
		Assert.assertEquals(st.countTokens(), elements.length);
	}
	
	@Test
	public void testQueueAddAndRemove() {
		Logger.log("################## testQueueAddAndRemove() ...");
		Queue q = new Queue();
		
		for(int i : elements) {
			q.add(i);
		}
		
		int[] removed = new int[10];
		int totalRemoved = -1;
		while(q.hasElements()) {
			int nodeData = q.remove();
			removed[++totalRemoved] = nodeData;
		}
		
		//verify
		boolean success = true;
		for(int i = 0; i <= totalRemoved; i++) {
			if(removed[i] != elements[i]) {
				success = false;
				break;
			}
		}
		
		Assert.assertTrue(success);
	}
	
	@Test void testReverseQueue() {
		Logger.log("################## testReverseQueue()...");
		Queue q = new Queue();
		
		for(int i : elements) {
			q.add(i);
		}
		
		q.reverseIterative();
		String s = q.printQueue();
		Logger.log("Reverse is " + s);
	}
}
