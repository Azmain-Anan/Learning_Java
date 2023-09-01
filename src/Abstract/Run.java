package Abstract;

public class Run {

	public static void main(String[] args) {
		
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getBr() {
		return br;
	}
	public void setBr(String br) {
		this.br = br;
	}
	private String move;
	private String br;
	public Run(String move, String br) {
		super();
		this.move = move;
		this.br = br;
	}
	@Override
	public String toString() {
		return "Run [move=" + move + ", br=" + br + "]";
	}
	
	public void vehi()
	{
		System.out.println("The vehicle is a" + "");
	}

}
