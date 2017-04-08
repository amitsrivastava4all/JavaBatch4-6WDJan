class R1
{
	static{
		System.out.println(" I Will Call When Class is loaded...");
	}
	{
		System.out.println("Init Block (Pre Constructor Call )");
	}
	{
		
	}
	{
		
	}
	
	R1(){
		System.out.println("I am a Cons and i will call when u create object");
	}
}
public class StaticVsInitBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R1 obj = new R1();
		R1 obj2 = new R1();
		R1 obj3 = new R1();
	}

}
