package Package_sample;
import java.util.Scanner;
abstract class Software{//Abstract class
	String mobileno;
	String otp;
	
	void user_input() {
		Scanner s=new Scanner(System.in );
		System.out.println("Enter Mobileno:");
		mobileno=s.nextLine();
		System.out.println("Enter otp:");
		otp=s.nextLine();
		
	}
	void user_login(){
		System.out.println("WELCOME TO What'sapp:");
		System.out.println("- - - - - - - - - - - -");
		System.out.println("Plesase login here..!!");
	}
		
	abstract void app_open();  //Abstract method
}
class Whatsapp extends Software{
	@Override
	void app_open() {
		while(true) {
			
		if ( mobileno. equals(994959041)&& otp.equals("1411@")){
			System.out.println("Sucessfully login,app is open:");
			break;
		}else {
			System.out.println("Invalid uname & pwd:please try again");
			user_input();
			
		}
	}
	}
	
	void app_close() {
		System.out.println("app is close...");
	
	}
	
}
public class App1 {

	public static void main(String[] args) {
		Whatsapp i =new Whatsapp();
		i.user_login();
		i.user_input();
		i.app_open();


	}

}
