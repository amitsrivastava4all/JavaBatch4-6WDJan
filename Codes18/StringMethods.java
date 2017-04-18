import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String MESSAGE="HeLlO";
		String a = "hello";
		String temp = "       Hello     How      ";
		System.out.println("["+temp.trim()+"]");
		System.out.println(a.length());
		System.out.println(a.toUpperCase() +" "+a);
		String address = "A-10, Shakti Nagar, Delhi-7";
		String arr [] = address.split(",");
		a.replace("l", "w");
		
		System.out.println("Building No "+arr[0]+" Zone "+arr[1]+" City "+arr[2]);
//		for(String a1 : arr){
//			System.out.println(a1);
//		}
		//if("hello".equals(a))
		System.out.println("hello".substring(2,5));
		System.out.println("Index of "+a.indexOf("l"));
		System.out.println(a.charAt(0));
		byte ww [] = a.getBytes();
		char ee []= "amit srivastava".toCharArray();
		Arrays.sort(ee);
		String w1 = new String(ee);
		System.out.println(w1);
		System.out.println();
		System.out.println(a.lastIndexOf("l"));
		System.out.println("Mr Ram Kumar".startsWith("Mr"));
		System.out.println("Mr Ram Kumar".endsWith("Kumar"));
		System.out.println("Compare To "+"ANIL".compareToIgnoreCase("anil"));
		System.out.println("Contains "+"Hi Hello How are You".contains("Fine"));
		if(MESSAGE.equalsIgnoreCase(a)){
		//if(a.equals("hello")){
			System.out.println("Same Value");
		}
		else
		{
			System.out.println("Not Same Value");
		}
		if(a==a.toUpperCase()){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		

	}

}
