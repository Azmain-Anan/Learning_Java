package JavaPrac;

public class MultidimenArray {

	public static void main(String[] args) {
		int [][] multiArray = {{2,3,5},{9,6,8}};
		for(int i=0;i<multiArray.length;i++)
		{
			for(int j=0;j<multiArray[i].length;j++)
			{
				System.out.println(multiArray[i][j]);
			}
		}

	}

}
