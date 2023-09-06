package Interface;

public class Circle implements Shapes{

	public static void main(String[] args) {
		Circle c = new Circle();
		c.drawShape();
		c.colorShape();
		c.moveShape();
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing Shape");
	}

	@Override
	public void colorShape() {
		System.out.println("Coloring Shape");
	}

	@Override
	public void moveShape() {
		System.out.println("Moving Shape");
	}
}
