/*
 * No Of Arguments can be change
 * Type of Arguments can be change
 * Position of Arguments can be change
 */
public class OverloadingDemo {
	
	public void search(String location){
		
	}
	public void search(int exp){
		
	}
//public double search(int exp){
//		return 0.0;
//	}
	public void search(double salary){
		
	}
	public void search(String location , int exp){
		
	}
	public void search(int exp , String location){
		
	}
	public void search(String location , double salary){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo obj = new OverloadingDemo();
		obj.search(9000.00);
	}

}
