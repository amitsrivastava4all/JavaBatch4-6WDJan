
public class Demo2 {

	public static void main(String[] args) {
		
		
		// switch case before 1.7 char , int , byte
		// Java 1.7 (String support in switch case)
		System.out.println("1. ");
		//final int SUNDAY = 1;
		//final int MONDAY = 2;
		//int day  = SUNDAY;
		String day = "Sunday";
		switch(day){
		//case SUNDAY:
		case "Sunday":
		System.out.println("Funny Day...");
			break;
		case "Monday":
			//case MONDAY:
			System.out.println("Working Day...");
			break;
		default:
			System.out.println("Invalid Day");
			
		}
		
		
		
		
		// Array
		//int p =10;
		int p[] = {10,20,30};
		// p[0]= 10 , p[1]=20 , p[2]= 30
		//String fruit = "apple";
		for(int i = 0 ; i<p.length; i++){
			System.out.println(p[i]);
		}
		String fruits[] = {"apple","orange"};
		for(String fruit : fruits){
			System.out.println(fruit);
		}
		
	
		int x[][]=new int[3][];
		x[0] = new int[10];
		x[1] = new int[20];
		x[2] = new int[30];
		//int x[][] = {{10,20,30},{90,100}};
		// Enhance for Loop
		for(int i[]:x){
			for(int j : i){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
//		for(int i= 0 ; i<x.length; i++){
//			for(int j = 0;j<x[i].length; j++){
//				System.out.print(x[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int y[][][] = {{{10,20,30},{90,100,10}},{{10,20,30},{90,100,10}}};
		
		
		
		
		
		

	}

}
