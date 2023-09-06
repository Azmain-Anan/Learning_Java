package JavaPrac;

public class ConstractorExample {
	
	public ConstractorExample()
	{
		System.out.println("Constroctor");
	}
	
	public ConstractorExample(int i)
	{
		System.out.println("Integer Constroctor");
	}
	
	public ConstractorExample(int i,int j)
	{
		System.out.println("2 Integer Constroctor");
	}
	
	public ConstractorExample(String s)
	{
		System.out.println("String Constroctor");
	}

	public static void main(String[] args) {
		ConstractorExample ce = new ConstractorExample("Anan");

	}

}
