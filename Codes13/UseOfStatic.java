// Utility Class = final class + private cons + static methods
// Utility Interface
interface Validation
//class Validation
{
	//private Validation(){}
	static boolean isEmpty(String value){
		if(value.trim().length()==0){
			return true;
		}
		else
		{
			return false;
		}
	}
}
class ITCustomer
{
	static int counter ; // Memory (Class  Load)
	int id;  // Memory ?  Instance variable
	String name;
	ITCustomer(int id , String name){
		this.id = id;
		this.name = name;
		counter++;
		//System.out.println("Counter is "+counter);
	}
}
public class UseOfStatic {

	public static void main(String[] args) {
		//Arrays.sort
		//Math.pow(a, b)
		System.out.println("Main Calling");
		// TODO Auto-generated method stub
//		for(int i = 1; i<=100000; i++){
//			ITCustomer customer = new ITCustomer(1002,"mike"+i);
//		}
		ITCustomer ram =new ITCustomer(1001,"ram");
		//System.out.println(ram.id);
		ITCustomer shyam = new ITCustomer(1002,"shyam");
		//System.out.println(ITCustomer.counter);
		//System.out.println("Enter the Name");
		String name = "";
		//Validation v = new Validation();
		//v.isEmpty("");
		if(Validation.isEmpty(name)){
			
		}
		//main(null);

	}

}
