class StaticAddition2 {
	public static void main(String[] args) {
		System.out.println("main is executed");
		add(10,20);
		add(15,15);
		add(20,30);
	}
	static void add(int a,int b){
		int c = a+b;
		System.out.println(c);
	}
}
