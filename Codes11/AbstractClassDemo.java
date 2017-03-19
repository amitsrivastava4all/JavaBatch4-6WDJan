/*
 * What is Abstract class
 * This class Object we can't create it is used for Inheritance
 * Acting as a parent class
 * Why Abstract Class
 * 
 */
abstract class Account1
{
	double amount;
	// might have abstract method or might not
	abstract void withDraw();
	double checkBalance(){
		return amount;
	}
	
}
class SavingAccount1 extends Account1
{

	@Override
	void withDraw() {
		// TODO Auto-generated method stub
		
	}
	
}
class CurrentAccount1 extends Account1{
	@Override
	void withDraw() {
		// TODO Auto-generated method stub
		
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount1 sa = new SavingAccount1();
		
		//Account1 a = new Account1();
		
				
	}

}
