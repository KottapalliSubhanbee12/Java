//final key word in java: using classes,method and variables
class Final{
	public void final_method1() {
		System.out.println("I AM FINAL METHOD1");
	}

}
class Final1 extends Final { //child
	public void final_method2() {
		System.out.println("I AM FINAL METHOD2");
	}

}

public class Inheritance1 {
	
	public static void main(String[] args) {
		final int a=100; //final varaiables
		//a=200;
		
		System.out.println("a value :"+a);
		Final1 f =new Final1();
		f.final_method1();
		f.final_method2();
	}

}
