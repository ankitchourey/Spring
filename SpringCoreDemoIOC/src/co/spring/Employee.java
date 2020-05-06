package co.spring;

//Bean or Model or POJO class(Plain old java object)
//NO BUSINESS LOGIC
public class Employee {

	//Attributes
	private int eId;
	private String eName;
	private String eAddress;
	
	//Methods...
	
	public Employee() {
		System.out.println("-----------Employee object Constructed-----------");
	}
	
	public Employee(int eId, String eName, String eAddress) {
		this.eId = eId;
		this.eName = eName;
		this.eAddress = eAddress;
	}
	
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

	public String geteAddress() {
		return eAddress;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + "]";
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
