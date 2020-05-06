package co.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
	
		//Object Construction | Done by developer (Traditional Way)
		
		Employee emp = new Employee();
		emp.seteId(101);
		emp.seteName("Sherlock Holmes");
		emp.seteAddress("Baker Street");
		
		System.out.println("Employee Details: "+emp);
		
//----------------------------------Spring Way | IOC (Inversion of control)----------------------------------------------------
		
		/*Resource resource = new ClassPathResource("employeebean.xml");
		BeanFactory factory = new XmlBeanFactory(resource); //Spring container which shall parse the XML files and construct objects
		
		Employee e1 = (Employee)factory.getBean("emp1");//Objects are created on request only 
		Employee e2 = factory.getBean("emp2",Employee.class);*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
		Employee e1 =(Employee)context.getBean("emp1"); //created our own init and destroy in emp1 bean object
		//Employee e2 = context.getBean("emp2",Employee.class);
		
		System.out.println("Employee Deatails: "+e1);
		//System.out.println("Employee Details: "+e2);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
		
	}

}
