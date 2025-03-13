class Encapsulation{
	private int id=100;  //getter is enough  bcoz value is intialized
	private String name="Mahi"; //getter is enough  bcoz value is intialized
	private String loc;    //getter and setter is required.
	public int getId() {   //getter method1
		return id;
	}
	public String getName() {  //getter method2
		return name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) { //setter method1
		this.loc=loc;
	}
}
public class Encapsulation1{
	public static void main(String[] args) {
		Encapsulation e= new Encapsulation();
		System.out.println("Id:"+e.getId());
		System.out.println("Name:"+e.getName());
		e.setLoc("Bangalore");
		System.out.println("Location:"+e.getLoc());
}
	
}



