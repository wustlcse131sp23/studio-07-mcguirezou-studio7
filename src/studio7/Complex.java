package studio7;

public class Complex {
	private double real;
	private double imag;
	
	public Complex(double initreal, double initimag) {
		real = initreal;
		imag = initimag;
	}
	public double getReal() {
		return real;
	}
	public double getImag() {
		return imag;
	}
	public Complex Add(Complex a, Complex b) {
		return new Complex (a.getReal()+b.getReal(),a.getImag()+b.getImag());
	}
	public Complex Multiply(Complex a, Complex b) {
		return new Complex((a.getReal()*b.getReal())-(a.getImag()*b.getImag()),(a.getReal()*b.getImag())+(b.getReal()*a.getImag()));
	}
}
