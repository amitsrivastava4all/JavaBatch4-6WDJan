import java.util.Scanner;

import org.apache.log4j.Logger;



class MinorAgeException extends RuntimeException
{
	private String msg;
	MinorAgeException(){}
	MinorAgeException(String msg){
		this.msg = msg;
	}
	@Override
	public String toString(){
		if(msg!=null){
			return msg;
		}
		return "U r a Minor U Can't Apply for DL and Pan Card.";
	}
}
public class BusinessExceptionDemo {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(BusinessExceptionDemo.class);
		logger.debug("Inside Main Class ");
		// TODO Auto-generated method stub
		System.out.println("Enter the Age");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		logger.debug("Age is "+age);
		try{
		if(age<18){
			throw new MinorAgeException("This is Some Problem , Kindly Contact to System Admin");
		}
		System.out.println("U Can apply for DL");
		System.out.println("U CAN apply for PanCard...");
		logger.debug("Main Going to end ");
		}
		catch(MinorAgeException obj){
			System.out.println(obj);
			logger.error("Exception in Main "+obj);
		}
		
	}

}
