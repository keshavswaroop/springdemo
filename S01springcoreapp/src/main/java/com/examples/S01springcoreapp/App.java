package com.examples.S01springcoreapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // extracted();
    	
    	// demo2();
    	
    	// demo3();
    	
    	demo4();
    }

	private static void demo4() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/sprinconfig4.xml");
        EmployeeDAO dao = (EmployeeDAO) ctx.getBean("dao1");
        System.out.println(dao);
	}

	private static void demo3() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/sprinconfig3.xml");
        Computer h1 = (Computer) ctx.getBean("homepc");
        System.out.println(h1);
        
        Computer o1 = (Computer) ctx.getBean("officepc");
        System.out.println(o1);
		
	}

	private static void demo2() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/sprinconfig2.xml");
        Car c1 = (Car) ctx.getBean("car");
        System.out.println(c1.hashCode());
        
        Car c2 = (Car) ctx.getBean("car");
        System.out.println(c2.hashCode());
        
        Object b1 = (Bank) ctx.getBean("b");
        System.out.println(b1.hashCode());
        
        Object b2 = (Bank) ctx.getBean("b");
        System.out.println(b2.hashCode());
	}

	private static void extracted() {
		System.out.println( "Hello World!" );
        
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/sprinconfig.xml");
        
        Employee e1 = (Employee) ctx.getBean("emp1");
        
        System.out.println(e1);
        
        Employee e2 = (Employee) ctx.getBean("emp2");
        
        System.out.println(e2);
        
        Employee e3 = (Employee) ctx.getBean("emp3");
        
        System.out.println(e3);
        
        Employee e4 = (Employee) ctx.getBean("emp4");
        
        System.out.println(e4);
        
        Employee e5 = (Employee) ctx.getBean("emp5");
        
        System.out.println(e5);
        
        Employee e6 = (Employee) ctx.getBean("emp6");
        
        System.out.println(e6);
        
        Employee e7 = (Employee) ctx.getBean("emp7");
        
        System.out.println(e7);
	}
}
