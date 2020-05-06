package co.spring;

//Bean or Model or POJO class(Plain old java object)
//NO BUSINESS LOGIC
public class Employee {

	//Attributes
	private int eId;
	private String eName;
	Address address;

	public Employee() {
		System.out.println("---Employee Object Constructed---");
	}
	
	//Constructor injection
	public Employee(Address address) {
		this.address=address; 
	}
	
//	public Employee(int eId, String eName, Address address) {
//		this.eId = eId;
//		this.eName = eName;
//		this.address = address;
//	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Address getAddress() {
		return address;
	}

	//Setter injection
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", address=" + address + "]";
	}

	public void myinit()
	{
		System.out.println("-----------Object Created-----------");
	}
	
	public void mydestroy()
	{
		System.out.println("-----------Object Destroyed-----------");
	}
}
