//static variable and methods in java:
//non static=instance variable
public class Static_variables {
//	variables
	static int a=100;  //static
	int b=200;  //non static
	
//	methods
	public static void static_method() {   //static
		System.out.println("Static Method");
	}
	public void nonstatic_method() {   //non-static
		System.out.println("Non-Static/instance Method");
	}
	
	
	public static void main(String[] args) {
		System.out.println("a value :"+a);
		Static_variables obj =new Static_variables ();
		System.out.println("b value :"+obj.b);
		
		static_method();
		
		obj.nonstatic_method();
				
	}

}

// instance=object
