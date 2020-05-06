package co.ankit.springanno;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String brand; //for spring brand is property which can be given by xml

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Is Working";
	}
	
	
}
