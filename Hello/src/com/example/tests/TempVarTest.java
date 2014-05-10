/**
 * @author dima
 * My first JUnit test
 * It test the result of method TempVar.doSomething (int m)
 * See this http://www.youtube.com/watch?v=GYtt29ZoNw8
 * and this http://www.vogella.com/tutorials/JUnit/article.html
 * and this http://www.mkyong.com/unittest/junit-4-vs-testng-comparison/
 * and this http://www.ibm.com/developerworks/java/library/j-cq08296/
 * 
 */
package com.example.tests;

import com.example.exercises.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TempVarTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
				
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDoSomething() {
		//here we create the instance under test
		TempVar tempVar = new TempVar();
		//here we store the result of instance's method under test 
		int k = tempVar.doSomething(0);
		//here we validate the result of method by defining the expected result 11 when input argument is 0
		
		assertTrue (k==11);
				
	}

}
