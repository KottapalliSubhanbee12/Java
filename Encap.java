//this keyword in java:
class Flower{
	private String flower_name;//attribute or properties
	private String flower_color;//attribute or properties1
	Flower(String flower_name,String flower_color){//constructor
		this.flower_name=flower_name;
		this.flower_color=flower_color;
		System.out.println("flower name is:"+flower_name);
		System.out.println("flower color is:"+flower_color);
		
	}
	public void flower_method() {  //flower user defined method
		System.out.println("flower name is in method:"+flower_name);
		System.out.println("flower color is in method:"+flower_color);
	}
}
public class Encap{
	public static void main(String[] args) {
		Flower f=new Flower("lotus","pink");
		f.flower_method();
	}
}


