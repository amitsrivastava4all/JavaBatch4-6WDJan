
public class Student {
	private int id;
	private String name;
	private int [] marks = new int[3];
	private String schoolName;
	Student(){
		schoolName="J.P";
	}
	//Student(int id , String name, int marks[]){
	Student(int id, String name, int ...marks){
		this();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	private  int getTotal(){
		int sum = 0;
		for(int mark: marks){
			sum = sum + mark;
		}
		return sum;
	}
	private double getPercentage(){
		return this.getTotal()/3;
	}
	private String getGrade(){
		return this.getPercentage()>90?"A Grade":"B Grade";
	}
	private void printLine(){
		System.out.println("********************************");
	}
	public void printMarkSheet(){
		printLine();
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Marks");
		for(int mark: marks){
			System.out.println(mark);
		}
		System.out.println("Total Marks "+this.getTotal());
		System.out.println("Percentage "+this.getPercentage());
		System.out.println("Grade "+this.getGrade());
		printLine();
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	
}
