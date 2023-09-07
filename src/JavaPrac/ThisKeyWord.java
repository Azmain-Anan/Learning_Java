package JavaPrac;

public class ThisKeyWord {
	
	int x;
	int y;
	String s;
	
	public ThisKeyWord()
	{
		System.out.println("Default Constroctor");
	}
	public ThisKeyWord(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println(x+y);
		System.out.println("Parameterized Constroctor");
	}

	public static void main(String[] args) {
		ThisKeyWord key = new ThisKeyWord(5,3);
		key.getData();

	}

	public void getData()
	{
		System.out.println(this.x+this.y);
	}
}
