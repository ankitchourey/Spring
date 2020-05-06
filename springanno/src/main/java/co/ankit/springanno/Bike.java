package co.ankit.springanno;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehical {
	public void drive()
	{
		System.out.println("Riding Bike....");
	}
}
