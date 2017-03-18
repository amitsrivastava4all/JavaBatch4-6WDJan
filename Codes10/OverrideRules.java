import java.io.IOException;

// Overriding 
/*
 * What is Overriding?
 * When Parent Method is outdated so child will enhance 
 * the outdated, this process is called Overriding
 * 
 * 1. Must be Inheritance
 * 2. Child Method Signature is same as parent
 * 3. Whenever we override and make child things 
 * the parent method is hide
 * 
 * Rule - 1 Weaker Access Rule
 * Rule - 2 CoVariant Rule
 * Rule -3 Sub Class Checked Exception Rule 
 */
class M
{
	
}
class Child extends Parent
{
	@Override
void output() throws IOException {
		
	}
	
	Y display(){
	Y obj = new Y();
	return obj;
	}
	@Override
	public void show(){
		System.out.println("Child Show Call");
	}
	@Override
	public void print(){
		
	}
}

public class OverrideRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.print();
		child.show();
		Parent p = new Parent();
		p.show();
	}

}
