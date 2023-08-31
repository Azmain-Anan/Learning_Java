package Encapsulation;

public class Common {
	
	private int length;
	private int width;
	private int height;
	
	public void setBoxDimention(int l,int w, int h) {
	
	if(l>=1 && w>=1 && h>=1)
	{
		System.out.println("Box created with the dimention"+" "+l+ " "+w+ " "+h+" ");
	}else
	{
		System.out.println("Invalid dimention");
	}
	
	}

	public int getLength() {
		return length;
	}

	public int setLength(int length) {
		if(length>=1)
		{
			this.length = length;
		}else
		{
			System.out.println("Invalid Length");
		}
		return length;
			
		//return this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public int setWidth(int width) {
		return this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int setHeight(int height) {
		return this.height = height;
	}
	

}
