/*
 * Inheritance 
 * a) Code Reuse
 * b) Polymorphism - One thing having several Form
 */
class Loan
{
	int accountNo;
	double balance;
	void emi(){
		System.out.println("Loan EMI");
	}
	void roi(){
		System.out.println("7.5 % ROI in Loan");
	}
	void disbruse(){
		System.out.println("Loan is Approved and Disbruse...");
	}
	
}
class HomeLoan extends Loan
{
	/*
	 * When Parent Feature is Outdated for Child
	 * and Child want improve version so child will override
	 * the parent function 
	 * So parent defination is Hide
	 * 
	 */
	@Override
	void roi(){
		super.roi();
		this.limit();
		this.roi(90);
		System.out.println("10% ROI for HomeLoan");
	}
	void roi(int x){
		System.out.println("this is overloaded version of roi...");
	}
	void limit(){
		System.out.println("LOan Limit...");
	}
}
public class OverrideVsOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OverrideVsOverloading obj = new OverrideVsOverloading();
		
		HomeLoan loan = new HomeLoan();
		loan.roi();
		//loan.emi();
		//loan.disbruse();
	

	}

}
