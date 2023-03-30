package studio7;

public class Fraction {
	private int num;
	private int denom;
	
	public Fraction(int initnum,int initden) {
		num = initnum;
		denom = initden;
	}
	public int getNum() {
		return num;
	}
	public int getDenom() {
		return denom;
	}
	public Fraction Addition(Fraction a, Fraction b) {
		return new Fraction(((a.getNum()*b.getDenom())+(b.getNum()*a.getDenom())),(a.getDenom()*b.getDenom()));
	}
	public Fraction Multiplication(Fraction a, Fraction b) {
		return new Fraction((a.getNum()*b.getNum()),(a.getDenom()*b.getDenom()));
	}
	public Fraction Reciprocal(Fraction a) {
		return new Fraction(a.getDenom(),a.getNum());
	}
	public static int gcd(int p, int q) {
		
		// FIXME compute the gcd of p and q using recursion
		if (q !=0) {
			gcd(p,p%q);
			
		}
		return p;
	
}
	public Fraction Simplify(Fraction a) {
		return new Fraction(a.getNum()/(gcd(a.getDenom(),a.getNum())),a.getDenom()/(gcd(a.getDenom(),a.getNum())));
	}
	public void main(String[] args) {
		Fraction a = new Fraction(6,10);
		Fraction b = new Fraction(2,4);
	}
}
