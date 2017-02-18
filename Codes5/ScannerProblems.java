import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerProblems {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "/Users/amit/Documents/TestFileHandlingFeb/Test/A.txt";
		PrintStream out = new PrintStream(path);
		//System.setOut(out);
		//System.out.println("Hello Java");
		//System.out.println("Another Value...");
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = s.nextInt();
		System.out.println("Enter the Name");
		s.nextLine();
		String name = s.nextLine();
		System.out.println(" Age is "+age +" NAme "+name);
		//s.close();
		Scanner d = new Scanner(System.in);
		System.out.println("Enter the Salary");
		double salary = d.nextDouble();
		System.out.println("Salary is "+salary);
		//d.close();
		d.close();
		s.close();
		
	}

}
