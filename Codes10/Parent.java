/**
 * this class is acting as a parent class
 * @author amit
 */
class X
{
	int p,a,b,c;
}
class Y extends X
{
	int q;
}

public class Parent
{
	void output() throws Exception{
		
	}
	
	X display(){
		X obj = new X();
		return obj;
	}
	 void print(){
		System.out.println("Parent Print Call");
	}
	/**
	 * this is show method
	 
	 */
	@Deprecated
	public void show(){
			System.out.println("Parent Show Call");
	}
}