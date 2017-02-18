import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the name and age");
		//System.out.println("Enter the Name");
		//String name = scanner.nextLine();  // Sentence
		String name = scanner.nextLine(); // Word 
		//System.out.println("NAME IS "+name);
		//System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println(name +" "+age);
		scanner.close();

	}

}
