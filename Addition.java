class Addition {
	/*
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	void add(){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	*/
	public static void main(String[] args){
		System.out.println("main is executed"); //only main executed becauuse 
		                                        //we dont USD method in main method
        //add(); //non-static method add()
		         //cannot be referenced from a static context
        
        sub();
		Addition a1 = new Addition();
		a1.add();
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	void add(){
	    System.out.println("add is executed");
	}
	static void sub(){
	     System.out.println("sub is executed");
	}
}
