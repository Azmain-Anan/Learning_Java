package JavaPrac;

public class WrapperDemo {

	public static void main(String[] args) {
		int i=10;
		Integer in = new Integer(i);  //wrapping
		System.out.println(in);
		
		int j = in;
		System.out.println(j);   //unwrapping

	}

}
