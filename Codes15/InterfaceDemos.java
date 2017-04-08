interface EE1{
	void print();
}
class WW implements EE1
{
	@Override
	public void print(){
		System.out.println("this is print");
	}
	public void show(){
		System.out.println("this is show");
	}
}
public class InterfaceDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EE1 obj = new WW();
		EE1 obj =new EE1(){
			@Override
			public void print(){
				System.out.println("this is print.....");
			}
		};
		obj.print();
		//obj.print();
		//obj.show();
		
		

	}

}
