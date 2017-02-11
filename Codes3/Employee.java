// S- SRP
// D - DRY - Don't Repeat YourSelf
//Class - Noun
// Encapsulation = Binding of Data and Methods into a Single Unit e.g. Class
// Data Hiding - make ur instance variables private (Data Secure)
//Gud Encapsulation - private variables + public methods
// Abstraction - Show Essential and Hide Not Essential
public class Employee {
private int id;  // (Instance Member) Member Variables of Employee Class
private String name;
private double salary;

private boolean isValidate(int id , double salary){
	if(id>0 && salary>0){
		return true;
	}
	else
	{
		return false;
	}
}
// i , n , s are local variables
public void takeInput(int id , String name , double salary){
if(isValidate(id, salary))	{
 this.id = id ; // Instance Variables = Local Variables
 this.name = name;
 this.salary = salary;
}
else
{
	System.out.println("Invalid Data....");
}
}
// verb
public void print(){
	// it will copy the reference of calling object into 
	// a special keyword called this
	// this keyword is injected in a class by default
	// this hold the current reference
	
	System.out.println(this.id);
	System.out.println(name);
	System.out.println(salary);
}
}