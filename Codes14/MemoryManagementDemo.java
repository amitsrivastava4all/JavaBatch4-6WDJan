import java.util.ArrayList;

class Employee{
	int id;
	String name;
	String phone;
	double salary;
	Employee(int id , String name, String phone, double salary){
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.salary  = salary;
		 
		
	}
}
public class MemoryManagementDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		for(int i = 1; i<=100000; i++){
			
		}
		long endTime= System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime - startTime)+" ms");
		long counter = 1;
		ArrayList list = new ArrayList(100);
		System.out.println("Program Start...");
		while(true){
			Employee emp = 
					new Employee(1001, 
							"Ram"+counter, "222"+counter, 9999);
			list.add(emp);
			counter++;
			Thread.sleep(50);
		}
	}

}
