package demos.problems.basics;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demos.problems.basics.List;
import demos.util.Logger;

public class ListTest {
	int[] elements = null;
	
	@BeforeTest
	public void setup() {
		elements = new int[] {20, 75, 65, 30, 45};
	}
	
	@Test
	public void testListReverse() {
		Logger.log("############## testListReverse() ##########");
		List list = new List();
		for(int i : elements) {
			list.add(i);
		}
		
		Logger.log("Original list " + list.printList());
		
		list.reverseIterative();
		String listStr = list.printList();
		Logger.log("Reversed List: " + listStr );
	}
}
