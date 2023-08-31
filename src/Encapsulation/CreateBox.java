package Encapsulation;

public class CreateBox {

	public static void main(String[] args) {
		Common cm = new Common();
		int l = cm.setLength(10);
		int w = cm.setWidth(5);
		int h = cm.setHeight(15);
		
		cm.setBoxDimention(l, w, h);

	}

}
