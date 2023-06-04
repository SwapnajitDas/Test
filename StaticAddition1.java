class StaticAddition1 {
	public static void main(String[] args) {
		System.out.println("main is executed");
		add();
		add();
		add();
		add();
	}
	static void add(){
		int a = 10;
		int b = 20;
		int c = a+b;
        System.out.println(c);
	}
}
