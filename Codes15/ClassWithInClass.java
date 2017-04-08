class ITStudent
{
	ITStudent(){
		BusFac bs = new BusFac();
	}
	private class BusFac{
		
	}
	class Library{
		
	}
}
class W11
{
	interface M
	{
		
	}
	class A implements M
	 
	{
		
	}
	class B extends A
	{
		
	}
}
public class ClassWithInClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITStudent.Library l = new ITStudent().new Library();
		ITStudent obj = new ITStudent();
		ITStudent.Library obj2 = obj.new Library();
	}

}
