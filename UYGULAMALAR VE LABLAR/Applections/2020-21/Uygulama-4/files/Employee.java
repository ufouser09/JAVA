package files;

@SuppressWarnings("serial")
public class Employee implements java.io.Serializable {
	
	   public String name;
	   public String address;
	   public transient int SSN;
	   public int number;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", SSN=" + SSN + ", number=" + number + "]";
	}
	   
	   
	
	   
	   
	
	
	   
	   
}
	   
	



