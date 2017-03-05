/*
 * 1. Code Reusablity
 * 2. Polymorphism
 */
// S O L I D
// S - SRP
// D - DRY
// O - Open /Close Principal
// Class is Open for extension and close for modification
class Account  // Parent/Base Class
{
	private int e;
	int id;
	String type;
	double balance;
	void withDraw(){
		System.out.println("Account Class WithDraw...");
	}
	void deposit(){
		System.out.println("Account Class Deposit...");
	}
	void roi(){
		System.out.println("Account Class ROI 4%");
	}
}
// SavingAccount (SubClass/Child) is a Account
class SavingAccount extends Account{
	@Override  // Annotation
	void roi(){
		System.out.println("SA 6% Rec");
	}
	@Override
	void withDraw(){
		System.out.println("Limit....");
	}
	void roi(int x){
		System.out.println("I am a Overloading..."); 
		
	}
	void roi(int x, int y){
		System.out.println("I am Two Param Overloading...");
	}
	
}
class CurrentAccount extends Account{
	@Override
	void roi(){
		System.out.println("7% ROI PAY....");
	}
	void odLimit(){
		System.out.println("OD Limit...");
	}
}
class LoanAccount extends Account{
	
}

class AccountCaller{
	void callMe(Account account){
		account.deposit();
		account.roi();
		account.withDraw();
		if(account instanceof CurrentAccount){
		//CurrentAccount ca = (CurrentAccount) account; // Downcasting
			((CurrentAccount)account).odLimit();
			//ca.odLimit();
		}
		else
		if(account instanceof SavingAccount){	
			SavingAccount sa = (SavingAccount) account;
			
			sa.roi(100);
			sa.roi(90, 100);
		}
	}
}
public class ISADemo {

	public static void main(String[] args) {
		AccountCaller ac = new AccountCaller();
		//Account ca = new CurrentAccount();  //Upcasting
		ac.callMe(new CurrentAccount());
		ac.callMe(new SavingAccount());
		//byte w = 1000;
		// TODO Auto-generated method stub
//		//Account sa = new SavingAccount();
//		SavingAccount sa = new SavingAccount();
//		sa.withDraw();
//		sa.roi();  // Call SavingAccount overridded roi
//		sa.roi(10);  // call SavingAccount overloaded roi
//		sa.roi(20,29);
//		sa.deposit();
//		System.out.println("****************");
//		Account ca = new CurrentAccount();  //Upcasting
//		ca.withDraw();
//		ca.roi();
//		ca.deposit();
//		ca.odLimit();
	
	}

}
