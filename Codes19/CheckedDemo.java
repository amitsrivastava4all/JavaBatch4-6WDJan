import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CheckedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/FilgklfjgldeHandlingTesting/downloader/xyz.txt";
		try {
			FileOutputStream fs = new FileOutputStream(path);
			fs.write("Hello How are you".getBytes());
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Path is Wrong or Might Be File Not Having Permission...");
		}

	}

}
