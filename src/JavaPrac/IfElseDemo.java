package JavaPrac;

public class IfElseDemo {

	public static void main(String[] args) {
		int num1 = 40;
		int num2 = 20;
		int num3 = 30;
		
		if (num1>num2)
		{
			System.out.println("Number 1 is greater than number 2");
			if(num2<num3)
			{
				System.out.println("Within nested if block");
			}
			else
			{
				System.out.println("In the else block");
			}
		}
		else if(num1==num2)
		{
			System.out.println("Number 1 is equal to number 2");
		}
		else if(num1<num2)
		{
			System.out.println("Number 2 is greater than number 1");
		}
		else
		{
			System.out.println("It is final else ");
		}

	}

}
