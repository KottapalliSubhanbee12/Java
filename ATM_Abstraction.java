package Package_sample;
import java.util.Scanner;
abstract class ATM{//parent class
	double balance;
	ATM(double balance){ //parent constructors
		this.balance=balance;	
	}
	abstract void withDraw(double amount);
	abstract void deposit(double amount);
	abstract void checkbal();
}
class SBI extends ATM{ //child class
	SBI(double balance){ //child constructor
		super(balance);
	}
	
//	withdraw method
	 void withDraw(double amount) {
		 if(amount>0 && amount<= balance) {
			 balance -= amount;
			 System .out.println("Withdraw Success,Avl balance"+balance);
		 }else {
			 System.out.println("Balance is not available");
		 }
	 }
	 
//	 deposit method
	 void deposit(double  amount) {
		 if(amount>0) {
			 balance+=amount;
			 System.out.println("deposit Success:Avl balance"+balance);
		 }else {
			 System.out.println("Invaild amount");
		 }
	 }
//	 checkbal
	 void checkbal(){
		 System.out.println("Currenty  balance"+balance);
	 }
}
public class ATM_Abstraction {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		SBI obj=new SBI(1000); //initial amount
		
		while (true) {
			 System.out.println("-------ATM-------");
			 System.out.println("1.withDraw Money");
			 System.out.println("2.Deposit Money");
			 System.out.println("3.Check Balance");
			 System.out.println("4.Exit");
			 System.out.println("---------------------");
			 
			 System.out.println("Enter your choice:");
			 
			 int choice =s.nextInt();
			 switch(choice) {
			 case 1:
				 System.out.println("Enter amount to withdraw");
				 double with_amt=s.nextDouble();
				 obj.withDraw(with_amt);
				 break;
			 case 2:
				 System.out.println("Enter amount to deposit");
				 double depo_amt=s.nextDouble();
				 obj.withDraw(depo_amt);
				 break;	 
			 case 3:
				 System.out.println("Avl balance");
				 obj.checkbal();
				 break;		 
			 case 4:
				 System.out.println("Thank u Using SBI ATM...!!");
				 s.close();
				 System.exit(0);
				 break;
			 default:
				 System.out.println("Enter valid choice....");
				 
			 }
			 
		}
	}

}
