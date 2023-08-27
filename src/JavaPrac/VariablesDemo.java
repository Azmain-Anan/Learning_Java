package JavaPrac;

public class VariablesDemo {
	
	int j = 20; //instance variable

	public static void main(String[] args) {

		int number1 = 5;
		int number2 = 15;
		
		char ch ='A';
		String str1 = "Java";
		System.out.println(str1 + " " +number1);
		System.out.println("Sum:" +(number1+number2));

	}
	
	//local variable
	public void myMethod()
	{
		int i = 30;
	}

}
