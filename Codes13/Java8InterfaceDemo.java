interface F1
{
	int X = 100;
	default void show(){
		System.out.println("F1 show Call");
	}
}
interface F2{
	int X = 200;
	default void show(){
		System.out.println("F2 show Call");
	}
}
interface F3 extends F1, F2{
	public default void show(){
		F1.super.show();
		F2.super.show();
		System.out.println("this is f3 show");
	}
}
class F4 implements F3
{

}
public class Java8InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F4 obj = new F4();
		obj.show();

	}

}
