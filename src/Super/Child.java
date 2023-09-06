package Super;

public class Child extends Parent {
	
	public Child()
	{
		super(1);
	}
	
	String empName= "Azmain";
	int empID= 1230;

	public static void main(String[] args) {
		Child c = new Child();
		c.getData();

	}
	public void getData()
	{
		System.out.println(super.empName);
		System.out.println(super.empID);
	}
	

}
