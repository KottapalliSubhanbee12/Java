//class Fruits{  //user define class 
//	Fruits(){ // default
//		System.out.println("I am Fruit1 Constructor");
//	}
//	Fruits(String name){ //parameterized
//		System.out.println("Fruit name is :"+name);
//	}
//}
//public class Constructor {
//	public static void main(String[] args) {
//		Fruits obj=new Fruits();	
//		Fruits obj1=new Fruits("Orange");	
//	}
//}

// constructor are 2 type:parameter,default

class Animals{
	Animals(){
		System.out.println("Dog_Details");
	}
	Animals(String name){
		System.out.println("Dog_name :"+name);
	}
	Animal1(String names){
		System.out.println("Dog_breed:"+names);
	}
	Animals(){
		System.out.println("Dog_");
	}
}
public class Constructor {
	public static void main(String[] args) {
		Animals obj=new Animals();	
		Animals obj1=new Animals("puppy");	
	}
}