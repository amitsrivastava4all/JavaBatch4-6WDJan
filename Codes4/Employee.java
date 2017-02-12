// OOPS Principals
// OOAD Principals
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
private String email;
private String phone;
private String pinCode;
private String managerName;
private final String companyName;



public int getId() {
	return id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPinCode() {
	return pinCode;
}
public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}
public String getManagerName() {
	return managerName;
}
public void setManagerName(String managerName) {
	this.managerName = managerName;
}
public String getCompanyName() {
	return companyName;
}
//public void setCompanyName(String companyName) {
//	this.companyName = companyName;
//}
private boolean isValidate(int id , double salary){
	if(id>0 && salary>0){
		return true;
	}
	else
	{
		return false;
	}
}
/*
 * Constructor Name must be same as class Name
 * Constructor returns nothing
 * Every Class by Default has a default Constructor (No Arguments)
 * Constructor - When Object is Construct, then Constructor is Call
 	Constructor is used to initialize the instance variables
 	If u create any Param cons , then default kill automatically
 */
Employee(){
	companyName="TCS";
}
// Param Cons (Constructor Overloading)
// Primary Fields
Employee(int id , String name, double salary){
	//Employee();
	// this() must be the first line 
	//this();  // Constructor Chain ( Now Calling Default Cons of same Class)
	this();
	this.id = id + companyName.length();
	this.name = name;
	this.salary = salary;
	//this();
}
// Shadow Problem 
// i , n , s are local variables
//public void takeInput(int id , String name , double salary){
//if(isValidate(id, salary))	{
// this.id = id ; // Instance Variables = Local Variables
// this.name = name;
// this.salary = salary;
//}
//else
//{
//	System.out.println("Invalid Data....");
//}
//}
// verb
public void print(){
	// it will copy the reference of calling object into 
	// a special keyword called this
	// this keyword is injected in a class by default
	// this hold the current reference
	
	System.out.println(this.id);
	System.out.println(name);
	System.out.println(salary);
	System.out.println(companyName);
}
}