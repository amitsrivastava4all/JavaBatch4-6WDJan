
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ram = new Employee();
		//ram = new Employee();
		ram.print();
		// ram is a instance of Employee
		// when ram comes in the memory then Employee things will come
		// id , name, salary (Instance Members)
		Employee shyam =new Employee(1002,"Shyam",5555);
		shyam.setSalary(shyam.getSalary() + 9090);;
		shyam.print();
		//shyam.takeInput(1002, "Shyam", 2222);
		//shyam.print();
		System.out.println("*********************");
		//Employee mike = ram;
		//ram.takeInput(-1001, "Ram" ,-9999);
		//ram.id = -1001;
		//ram.name="Ram";
		//ram.salary = -9090;
		//ram.print();  //77.print()
//		System.out.println(ram.id +" "+mike.id);
//		System.out.println(ram.name);
//		System.out.println(ram.salary);
//		if(ram==mike){
//			System.out.println("Same Ref");
//		}
//		else
//		{
//			System.out.println("Not Same Ref");
//		}
//		System.out.println("**************************");
		
		// ram - 77 (Reference)
		// ram is a reference variable 
		// because it hold a reference
	}

}
