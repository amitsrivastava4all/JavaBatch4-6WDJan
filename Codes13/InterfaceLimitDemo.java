import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

abstract class AbDemo
{
	int x ;  // int x (Variable)
	//Variable Initalize (Constructor)
	AbDemo(){
		x = 20;
	}
	// Can Have Abstract methods
	
}
// At a time i can extend only one class 
class W1 extends AbDemo
{
	
}

// All Method need to be Override
interface PP
{
	default void show(){
		
	}
	void add();  // public abstract void add();
	void delete();
	
}
class PP1 implements PP
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
}
// abstract methods + Constants
interface InterDemo
{
	int x=20;  // public static final int x = 20;   
}
interface InterDemo1
{
	
}
class W2 implements InterDemo, InterDemo1{
	
}
public class InterfaceLimitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WindowListener l ; 
		WindowAdapter w ;

	}

}
