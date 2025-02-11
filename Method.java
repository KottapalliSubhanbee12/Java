//Method over loading java:
class MethodOverLoading{
	public static void add() { //Normal method
		System.out.println("Addition");
	}
	int add(int a,int b) {  //Parameterized method
		return a+b;
	}
	int add(int a,int b,int c) {  //Parameterized method
		return a+b+c;
	}
}
public class Method {

	public static void main(String[] args) {
		MethodOverLoading obj=new MethodOverLoading();
		obj.add();
		System.out.println("Addition is"+obj.add(10,20,30));
		
	}

}
