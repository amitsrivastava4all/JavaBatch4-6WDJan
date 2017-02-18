import java.util.Scanner;

public class ScannerBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp2 = "Hello how are you";
		String arr[] = temp2.split(" ");
		int sum = 0;
		for(String a : arr){
			sum = sum + a.length();
			System.out.println(a);
		}
		System.out.println("Sum is "+sum);
		String temp = "Hello";
		System.out.println(temp.length());
		int counter = 0;
		Scanner scanner= new Scanner("Hello how are you\n I am Fine");
		while(scanner.hasNextLine()){
			counter++;
			System.out.println(scanner.nextLine());
		}
		System.out.println("Line Count "+counter);

	}

}
