// Dynamic or late Binding in Polymorphism:
class Animal {
	public  void sound() {
		System.out.println("Animals Sounds");
	}
	
}
class Dog extends Animal {//child1 class
	@Override
	public void sound() {
		System.out.println("Bow Bow");
	}
	
}
public class Dynamic_poly {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
	}

}
