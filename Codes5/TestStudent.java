import java.io.IOException;

public class TestStudent {

	public static void main(String[] args) throws IOException {
		System.err.println("Hello Java ");
		System.out.println("Enter the Name");
		int singleByte = System.in.read();  // single byte read
		System.out.println("Read "+(char)singleByte);
		// TODO Auto-generated method stub
		int marks[]= {90,78,44};
		Student ram = new Student(1001,"Ram",marks);
		ram.printMarkSheet();
		
		marks[0]=90;marks[111]=89;marks[2]=90;
		Student shyam = new Student(1001,"Ram",90,89,77);
		shyam.printMarkSheet();
		//Student mike = new Student(1001,"Ram");
	}

}
