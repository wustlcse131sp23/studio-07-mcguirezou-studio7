package studio7;

public class Die {
	private int sides;
	
	public Die(int initsides) {
		sides = initsides;
	}
	public int Roll() {
		return (int) (Math.random()*sides +1);
	}
	
	public static void main(String[] args) {
		Die d6 = new Die(6);
		System.out.println(d6.Roll());
	}
}
