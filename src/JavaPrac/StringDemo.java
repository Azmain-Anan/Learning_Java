package JavaPrac;

public class StringDemo {

	public static void main(String[] args) {
		String srt1 = "Anan";
		String srt3 = "Anan";
		String srt2 = new String("Anan");
		
		System.out.println(srt1==srt3);
		System.out.println(srt1==srt2);
		System.out.println(srt1.equals(srt2));
		
	}

}
