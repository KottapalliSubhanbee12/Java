//Super key word in java:
class Super{   //user define class
	String name;
	Super(String name){  //constructor
		this.name=name;
		System.out.println("My name in constructor:"+this.name);
	}
	
}
class Child7 extends Super{
	Child7 (String name){
		super(name);    //super key word
	System.out.println("My name in constructor(child):"+this.name);
	}
}
public class Superkey {
	public static void main(String[] args) {
		Child7 s=new Child7("subbu");

	}

}
