import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		//int p [] = {10,20,30,40,50};
		//int [] p = {10,20,30,40,50};
		//int [] p = new int[5];
		int []p = new int[]{10,20,30,40,50};
//		for(int i = 0 ; i<p.length; i++){
//			System.out.println(p[i]);
//		}
		// 1.5 Enhance for Loop
//		for(int i : p){
//			System.out.println(i);
//		}
		
		// Java 1.8 For Each Function 
		List l = Arrays.asList(10,20,30,40,50);  // Convert Normal (Traditional Array) into Java List
		l.forEach((t)->System.out.println(t));
		
		//System.out.println(l);
	}

}
