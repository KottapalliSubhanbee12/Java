package Package_sample;

interface Animals1{
	abstract void sound();
		
}
class Horse implements Animals1{
	@Override
	public void sound() {
		System.out.println("Woof Woof");
	}
}
class Tiger implements Animals1{
	@Override
	public void sound() {
		System.out.println("Gur Gurr");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		Horse h=new Horse();
		h.sound();
		Tiger T=new Tiger();
		T.sound();
	}

}
