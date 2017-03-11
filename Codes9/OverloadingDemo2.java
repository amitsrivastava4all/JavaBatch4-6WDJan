class EE
{
	void print(Object x){
		System.out.println("Object ...");
	}
	void print(String x){
		System.out.println("String...");
	}
	void print(Integer x){
		System.out.println("Integer...");
	}
}
public class OverloadingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EE obj = new EE();
		//obj.print(null);
		//obj.print("AAA");
		//obj.print(x);

	}

}
