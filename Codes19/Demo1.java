import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	static int firstNo ;
	static int secondNo ;
	static Scanner scanner =new Scanner(System.in);
	static void takeFirstNo(){

		
		System.out.println("Enter the First No");
		try{
		 firstNo = scanner.nextInt(); // throw new InputMismatchException();
		}
		catch(InputMismatchException e){
			
			System.out.println("Only Number Allowed ");
			scanner.nextLine();
			takeFirstNo();
		}
	}
static void takeSecondNo(){

		
		System.out.println("Enter the Second No");
		try{
		 secondNo = scanner.nextInt(); // throw new InputMismatchException();
		 if(secondNo==0){
			 System.out.println("Zero Not Allowed");
			 takeSecondNo();
		 }
		}
		catch(InputMismatchException e){
			
			System.out.println("Only Number Allowed ");
			scanner.nextLine();
			takeSecondNo();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		takeFirstNo();
		takeSecondNo();
		int result= firstNo/secondNo;
		System.out.println(result);
		scanner.close();
	}

}
