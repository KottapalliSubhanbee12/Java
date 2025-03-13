class poly{ //parent class
	public static void poly_method() {
		System.out.println("Parent Method");
	}
}
class poly_Child extends poly{  //child class
	@Override
	public void poly_method() {   //static method can not be override so take void only
		System.out.println("Child Method");
	}
}
public class Polymorphism{
	poly_Child p = new poly_method() {
		p.poly_method();
	}
}
