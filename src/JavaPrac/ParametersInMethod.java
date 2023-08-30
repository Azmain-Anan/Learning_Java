package JavaPrac;

public class ParametersInMethod {

	public static void main(String[] args) {
		ParametersInMethod md = new ParametersInMethod();
		System.out.println(md.addNumber(10, 8));
		md.differentpara("THis is Anan", 20, 16);
		
	}
	
	public int addNumber(int x, int y)
	{
		int z = x+y;
		return z;
	}
	
	public void differentpara(String i, int j, float k)
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

}
