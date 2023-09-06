package Super;

public class Parent {
	
	public Parent()
	{
		System.out.println("Constroctor");
	}
	
	public Parent(int i)
	{
		System.out.println("Parameterized Constroctor");
	}
	
	String empName= "Anan";
	int empID= 3210;
	
	public void getData()
	{
		System.out.println(empName);
		System.out.println(empID);
	}

}
