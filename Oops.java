
public class Oops {
	int b=100;//Non static variable
    static int c=200;
	public static void main(String[] args) {
		int a=10;//local
		System.out.println(a);
		System.out.println(c);
		Oops obj=new Oops();
		System.out.println(obj.b);
		
	}

}
