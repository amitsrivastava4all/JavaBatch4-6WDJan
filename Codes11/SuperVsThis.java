class P1
{
	int x ; 
	int y ;
	P1(){
		x = y = 200;
		System.out.println("Parent class Cons Call");
	}
	P1(int x){
		this();
		this .x = x;
		System.out.println("Parent Param Cons Call");
	}
	void show(){
		System.out.println("P1 Show");
	}
}
class C1 extends P1
{
	int a ,b,c;
	C1(){
		super(900);
		//super(); Implict Call Parent Default Cons first line 
		a = b = c = 100;
		
		System.out.println("Child Class Cons Call "+(a+super.x));
	}
	C1(int x){
		this();
		System.out.println("This is Child Class Param Cons");
	}
	int x = 20 ;
	@Override
	void show(){
		super.show();
		System.out.println("C1 Show "+(super.x + this.x + y));
	}
}

public class SuperVsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method calling check Object creation
		// variable calling check class type
		P1 obj = new C1(99);
		obj.show();
		System.out.println("X is "+obj.x);
	}

}
