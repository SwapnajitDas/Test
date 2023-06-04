class Example {
	public static void main(String[] args) {
		System.out.println("main is executed");
		m1();
		m2();
        Example e1 = new Example();
		Example e2 = new Example();
		e1.m3(); e1.m4();
        e2.m3(); e2.m4();
	}
	static void m1(){
		System.out.println("m1 is executed");
	}
	static void m2(){
		System.out.println("m2 is executed");
	}
	void m3(){
		System.out.println("m3 is executed");
	}
	void m4(){
		System.out.println("m4 is executed");
	}
}
