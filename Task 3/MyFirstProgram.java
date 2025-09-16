class MyFirstClass {
	public static void main(String[] s) {
		MySecondClass o = new MySecondClass(3, 4);
		System.out.println(o.getMax());

		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				o.setA(i);
				o.setB(j);
				System.out.print(o.getMax());
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}

class MySecondClass {
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

	MySecondClass(int A, int B) {
		setA(A);
		setB(B);
	}
	
	public int getMax() {
		return (a > b) ? a : b;
	}
}