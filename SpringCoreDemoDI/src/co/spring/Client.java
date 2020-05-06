package co.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	
//----------------------------------Spring Way | IOC (Inversion of control)----------------------------------------------------
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
		Employee e1 =(Employee)context.getBean("emp1"); //created our own init and destroy in emp1 bean object
		Employee e2 = context.getBean("emp2",Employee.class);
		
		System.out.println("Employee1 Deatails: "+e1);
		System.out.println("Employee2 Details: "+e2);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close(); //close content
		
	}

}
