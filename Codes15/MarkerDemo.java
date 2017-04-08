interface VIP{
	
}
class Student1 implements VIP{
	
}
class Customer1{
	
}
// Every Class is a child class of Object Class
class Emp implements Cloneable 
{
	int id ;
	String name;
	double salary ;
	Emp(int id, String name){
		this.id = id;
		this.name = name;
		salary = 9999;
	}
	@Override
	protected  Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class MarkerDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Emp emp =new Emp(1001,"Ram"); //Has-A
		emp.salary = 9999 + emp.salary;
		Emp emp4 =  (Emp)emp.clone();
		System.out.println("After Clone");
		if(emp==emp4){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("not Same Ref");
			System.out.println("Emp Values "+emp.id + " "+emp.name+" "+emp.salary);
			System.out.println("Emp4 Values "+emp4.id +" "+emp4.name+" "+emp4.salary);
		}
		Emp emp3 = emp;
		Emp emp2 = new Emp(1001,"Ram");
		Student1 ram =new Student1();
		if(ram instanceof VIP){
			System.out.println("ram Treat in VIP Way");
		}
		else
		{
			System.out.println("Ram can't Treat u in VIP WAY");
		}
		Customer1 shyam = new Customer1();
		if(shyam instanceof VIP){
			System.out.println("shyam Treat in VIP Way");
		}
		else
		{
			System.out.println("shyam can't Treat u in VIP WAY");
		}

	}

}
