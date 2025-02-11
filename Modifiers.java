package My_package;
class Modi{        //User Defined class
	public int a=100; //public
	protected int b=200; //protected
	int c=300; //default
	private String name;  //private
	
	
	public String getName() {  //getter Method
		return name;
	}
	public void setName(String name) {  //Setter Method
		this.name=name;
		
	}
	
}
public class Modifiers {  //main class
	public int a=100;  //public
    protected int b=200; //protected
    int c=300;//default
    private String name="subbu"; //private
	public static void main(String[] args) {
		Modifiers obj= new Modifiers();   //Main Class object
		System.out.println("a value is:"+obj.a);
		System.out.println("b value is:"+obj.b);
		System.out.println("c value is:"+obj.c);
		System.out.println("My nameis:"+obj.name);
		Modi m=new Modi();                       //user define class object
		System.out.println("a value is:"+m.a);
		System.out.println("b value is:"+m.b);
		System.out.println("c value is:"+m.c);
		m.setName("subbu");
		System.out.println("My name is:"+m.getName());
		
	}

}
