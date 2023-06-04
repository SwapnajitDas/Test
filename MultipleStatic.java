class MultipleStatic {
	public static void main(String[] args) {
		System.out.println("main is executed");
		m1(); m2();
	}
	static void m1(){
		System.out.println("m1 is executed");
	}
	static void m2(){
		System.out.println("m2 is executed");
    }
}
