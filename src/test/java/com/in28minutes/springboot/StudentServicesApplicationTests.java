package com.in28minutes.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServicesApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testAdd1Plus1() 
	{
    	int x  = 1 ; int y = 1;
    	assertEquals(2, myClass.add(x,y));
	}

}
