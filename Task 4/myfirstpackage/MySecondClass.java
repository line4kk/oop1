package myfirstpackage;

public class MySecondClass {
	private int a, b;
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}

	public void setA(int A) {
		a = A;
	}

	public void setB(int B) {
		b = B;
	}

	public MySecondClass(int A, int B) {
		setA(A);
		setB(B);
	}
	
	public int getMax() {
		return (a > b) ? a : b;
	}
}