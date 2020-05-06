package co.ankit.springanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
    	
		/*
		 * Vehical vh = (Vehical)context.getBean("car"); System.out.println(vh);
		 * vh.drive();
		 */
    	
    	Car c = (Car)context.getBean("car");
    	c.drive();
    	
//     	Tyre ty = (Tyre) context.getBean("tyre");
//    	System.out.println(ty);
    }
} 
