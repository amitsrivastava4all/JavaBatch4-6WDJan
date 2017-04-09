class VV
{
	void print(){
		 int e = 100; // local variable
		
		class FF
		{
			void show(){
				System.out.println("FF Show...."+e);
			}
		}
		FF obj =new FF();
		obj.show();
		//e++;
		System.out.println("E is "+e);
	}
}

// Nested Class
class DD
{
	static class  WW
	{
		static void show(){
			System.out.println("Show...");
		}
	}
}
// Inner Class
class A
{
	int x = 10;
	private class WW
	{
		
	}
	A(){
		System.out.println("A Cons");
	}
	class RR{
	int x = 1000;
		class B
	{
		int x = 20;
		B(int x){
			System.out.println("B Cons "+(RR.this.x+A.this.x+this.x+x));
		}
	}
	}
}
public class CompDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A obj = new A();
		//A.B obj2 =obj.new B();
	A.RR.B obj = new A().new RR(). new B(30);
	DD.WW.show();
	System.out.println("*******************");
	VV v = new VV();
	v.print();
	}

}
