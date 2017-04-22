
public class FinallyDemo {
	static void db() throws ArrayIndexOutOfBoundsException{
		try{
		System.out.println("Connection Open");
		System.out.println("Execute Query...");
		int d [] = new int[10];
		if(10>2){
		System.exit(0);
			//return ;
		}
		//d[1000] = 200; // throw new ArrayIndexOutOfBoundsException
		//int e = 100/0;
		System.out.println("Get the DB Result");
		}
		finally{
		System.out.println("Connection Close...");
		}
	}
	static void helper() throws ArrayIndexOutOfBoundsException{
		System.out.println("Get the Value from the View");
		System.out.println("Call the  DB ");
		db();
		System.out.println("Get the DB Result");
		System.out.println("Return the Result to view...");
		
	}
	static void view(){
		System.out.println("View Start");
		System.out.println("Call the Helper");
		try{
		helper();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("SOME DB ISSUE FOUND....");
			return ;
			
		}
		System.out.println("Get the Helper Result");
		System.out.println("Render the Result on View");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		view();
	}

}
