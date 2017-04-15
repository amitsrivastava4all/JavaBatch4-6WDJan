
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String 
		String c = new String("hello"); // 2 or 1 
		String a = "hello".intern();  //1 or 0 
		String b = "hello";
		if(a==c){
			System.out.println("Same Pool");
		}
		else
		{
			System.out.println("OutSide Pool");
		}
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		a = "Ok";
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		Runtime r = Runtime.getRuntime();
		printMemoryDetails(r);
		String temp = "Hello";
		long startTime = System.currentTimeMillis();
		for(int i = 1; i<=100000; i++){
			//String temp2 = "Hello";
			//temp = temp + i;
			String temp2 = new String("Hello"+i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime - startTime)+"ms");
		printMemoryDetails(r);
		

	}
	
	public static void printMemoryDetails(Runtime r){
		System.out.println("Total Memory "+r.totalMemory());
		System.out.println("Free Memory "+r.freeMemory());
		System.out.println("Used Memory "+(r.totalMemory()-r.freeMemory()));
	}

}
