// Life Cycle Methods
class Student
{
	static Student catchTheSoul;
	int id;
	String name;
	Course course ;
	Student(Course course){
		id =1001;
		name = "ram";
		this.course =course;
		System.out.println("Student Born...");
		//course = new Course();
	}
	// it is call when object is going to die
	@Override
	protected void finalize(){
		catchTheSoul = this;
		System.out.println("Bye Bye Student ...."+this+" Catch the Soul "+catchTheSoul);
	}
}
class Course{
	Course(){
		System.out.println("Course Born");
	}
	@Override
	protected void finalize(){
		System.out.println("Bye Bye Course ....");
	}
}
class Emp
{
	int id;
	String name;
	Emp(int id , String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode(){
		return name.length();
	}
	
	
}
public class AggDemo {

	public static void main(String[] args) {
		Emp emp = new Emp(1001,"ram");
		Emp emp2 = new Emp(1002,"shyam");
		Emp emp3 = new Emp(1003,"tom");
		System.out.println(emp+" "+emp2+" "+emp3);
		Course course = new Course();
		Student ram =new Student(course);
		System.out.println("Before Null "+ram);
		ram = null;
		System.out.println("After Null "+ram);
		System.gc();
		for(int i = 1; i<=10; i++){
			System.out.println("Some Processing is Going On... "+i);
		}
		System.out.println("Before Reborn "+ram);
		ram = Student.catchTheSoul;
		System.out.println("Ram Reborn "+ram);
		System.out.println(ram.id +" "+ram.name);
		// TODO Auto-generated method stub

	}

}
