package JavaPrac;

public class OperatorsJava {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		num1 ++;
		num1--;
		
		boolean bool = !true;//inverse 
		System.out.println(bool);
		
		if(num1==num2)
		{
			System.out.println("Numbers are equal");
		}
		else
		{
			System.out.println("Numbers are not equal");
		}
		
		if(num1 == 10 || num2==20)
		{
			System.out.println("This is a conditioanl operator");
		}
		
		System.out.println(num1+num2);//addition
		System.out.println(num2%num1);//remainder

	}

}
