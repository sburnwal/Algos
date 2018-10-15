package demos.problems.basics;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import demos.problems.basics.Stack;
import demos.util.Logger;

public class StackTest
{
	Random r = null;
	
	@BeforeClass
	public void setup() {
		r = new Random(1000);
	}
	
	@Test
	public void testStackFull() {
		Logger.log("################ Testing stack full...");
		Stack s = new Stack(5);
		for(int i = 0; i < 5; i++) {
			s.push(r.nextInt());
		}
		
		boolean stackFull = false;
		try {
			s.push(r.nextInt());
		} catch (Exception e) {
			Logger.log(e.toString());
			stackFull = true;
		}
		
		Assert.assertTrue(stackFull);
	}
	
	@Test
	public void testStackEmpty() {
		Logger.log("################ Testing stack empty...");
		Stack s = new Stack(5);
		for(int i = 0; i < 2; i++) {
			s.push(r.nextInt());
		}
		
		for(int i = 0; i < 2; i++) {
			int data = s.pop();
			Logger.log("Popped from stack " + data);
		}

		boolean stackEmpty = false;
		try {
			int data = s.pop();
			Logger.log("Popped from stack " + data);
		} catch (Exception e) {
			Logger.log(e.toString());
			stackEmpty = true;
		}
		
		Assert.assertTrue(stackEmpty);
	}

}
