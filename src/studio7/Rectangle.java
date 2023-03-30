package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double initlength, double initwidth) {
		length = initlength;
		width = initwidth;
		
	}
	public double Area() {
		double area = length*width;
		return area;
	}
	public double Perimeter() {
		double perimeter = (2*length)+(2*width);
		return perimeter;
	}
	public static boolean isSmaller(Rectangle a, Rectangle b) {
		if(a.Area() < b.Area()) {
			return true;
		}
		return false;
	}
	public boolean isSquare() {
		if(length == width) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a = new Rectangle(.5,.5);
		Rectangle b = new Rectangle(.7,.9);
		System.out.println(isSmaller(a,b));
		System.out.println(a.isSquare());
	}

}
