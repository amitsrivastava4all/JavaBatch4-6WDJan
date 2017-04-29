class Emp //extends Object
{
	int id;
	String name;
	double salary;
	Emp(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString(){
		return "Id "+id+" Name"+name+" Salary "+salary;
	}
}
public class WhyWeOverrideToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp ram = new Emp(1001,"Ram",9999);
		System.out.println(ram);  // ram.toString();
	}

}
