// implementation of abstraction
package Package_sample;
import java.util.Scanner;
abstract class Softwares{//Abstract class
	String user_name;
	String password;
	
	void user_input() {
		Scanner s=new Scanner(System.in );
		System.out.println("Enter username:");
		user_name=s.nextLine();
		System.out.println("Enter password:");
		password=s.nextLine();
		
	}
	void user_login(){
		System.out.println("WELCOME TO INSTRAGRAM:");
		System.out.println("- - - - - - - - - - - -");
		System.out.println("Plesase login here..!!");
	}
		
	abstract void app_open();  //Abstract method
}
class Instagram extends Softwares{
	@Override
	void app_open() {
		while(true) {
			
		if (user_name . equals("Mahi")&& password.equals("1411@")){
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
public class Apps {

	public static void main(String[] args) {
		Instagram i =new Instagram();
		i.user_login();
		i.user_input();
		i.app_open();

	}

}
