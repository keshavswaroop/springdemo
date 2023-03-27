package com.examples.S01Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S01Autowiring/springconfig.xml");
    	
    	Employee emp = (Employee) ctx.getBean("emp1");
    	System.out.println(emp);
    }
}
