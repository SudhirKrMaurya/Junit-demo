package com.junit.demo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class Mathtest {
@Before
public void before() {
	System.out.print("before"); 
}
@After

public void after()
{
	System.out.println("after");
	}
	@Test
	public void testMath() {
		Math math=new Math();
	int result=math.sum(new int[] {1,2,8});
	assertEquals(11, result);
		
	
	}
	@Test
   public void testMath1() {
		Math math=new Math();
	int result=math.sum(new int[] {1,8});
	assertEquals(9, result);
		
	
	}

}
