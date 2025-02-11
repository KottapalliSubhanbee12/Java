public class Built {
//	Static method
	public static void method1() {
		System.out.println("This is Static");
	}
//	Non Static Method
	void method2() {
		System.out.println("This is non Static");
	}
	void method3() {
		System.out.println("This is method3");
	}
//	Any data type like int, float..
	static int add(int a, int b) {  
		return a+b;
	}
	public static void main(String[] args) {
		method1();
		Built obj=new Built();
		obj.method2();
		obj.method3();
		System.out.println("Addition:"+add(10,20));
	}

}

//public class Built {
//	static void method1() {
//		System.out.println("This is Static");	
//	}
//	void method2() {
//		System.out.println("This is non Static");
//	}
//	public static void main(String[] args) {
//		method1();
//		Built obj=new Built();
//		obj.method2();
//	}
//
//}
