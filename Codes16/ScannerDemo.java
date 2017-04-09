import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Age");
		int age1 = Integer.parseInt(br.readLine());
		System.out.println("Age1 "+age1);
		//br.close();
		// TODO Auto-generated method stub
		// Scanner , System , String is predefine API
		// Scanner? - It is a Buffer , take value from System.in
		Scanner scanner= new Scanner(System.in); //1.4
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println("Enter the Name");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Age "+age+" Name "+name);
		
		Scanner scanner2= new Scanner(System.in);
		System.out.println("Enter the City");
		String city = scanner2.next();
		br.close();
		scanner.close();
		scanner2.close();

	}

}
