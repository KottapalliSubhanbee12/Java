//built practice
public class Practise {
	public static void method1() {
		System.out.println("This is Static");
	}
	void method2() {
		System.out.println("This is non Static");
	}
	void method3() {
		System.out.println("This is method3");
	}
	public static void main(String[] args) {
		method1();
		Practise obj=new Practise();
		obj.method2();
		obj.method3();
		
	}

}
