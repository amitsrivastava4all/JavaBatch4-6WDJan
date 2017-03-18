import java.io.File;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//ArithmeticException
		int w[]  = new int[5];
		w[99] =100;
		String path = "/Users/amit/Documents/TestFileHandlingFeb/Test/B.txt";
		File file = new File(path);
		file.createNewFile();
		System.out.println("Done...");
		
//		System.out.println("Program Start");
//		int e = 100/0;
//		System.out.println(e);
//		System.out.println("Program End");

	}

}
