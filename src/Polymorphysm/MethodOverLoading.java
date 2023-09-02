package Polymorphysm;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading mo = new MethodOverLoading();
		mo.logIn(1234, "password");
		mo.logIn("username", 321, "password");

	}
	
	public void logIn(String x, String y)
	{
		System.out.println("Login successful by username and password");
	}
	
	public void logIn(int x, String y)
	{
		System.out.println("Login successful by phoneNumber and password");
	}
	
	public void logIn(String x,int z, String y)
	{
		System.out.println("Login successful by username/pin and password");
	}
	

}
