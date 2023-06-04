class MultipleNonStatic {
	public static void main(String[] args) {
		System.out.println("main is executed");
        MultipleNonStatic n1 = new MultipleNonStatic();
		MultipleNonStatic n2 = new MultipleNonStatic();
		n1.m1();n1.m2();
		n2.m1();n2.m2();
	}
	void m1(){
		System.out.println("m1 is executed");
	}
    void m2(){
		System.out.println("m2 is executed");
	}
}
