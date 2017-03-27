interface A1
{
	int X = 100;
	void show();
	void print();
}
interface A2
{
	int X = 200;
	void show();
	void disp();
}
// Multiple Inheritance
interface A3 extends A1, A2{
	void output();
}
// Multiple Implementation
class A5 implements A1, A2{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
class A4 implements A3
{

	@Override
	public void show() {
		System.out.println(A1.X + A2.X);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
