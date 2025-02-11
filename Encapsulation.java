//Encapsulation in java.(1st prinicpile of oops concept)
class Encapsulations{  //user defind class
	private String name="subbu";
	
	public String getname() {
		return name;
	}
}
public class Encapsulation { //Main class
	
	public static void main(String[] args) {
		Encapsulations e= new Encapsulations();
		System.out.println("My name:"+e.getname());

	}

}

//for encapsulation the object is failed
