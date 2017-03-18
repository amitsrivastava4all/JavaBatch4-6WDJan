import test.WW;

class DD extends WW
{
	int z = 20;
	void print(int z){
		System.out.println(super.z+this.z+z);
		//z = 1000;
	}
}
public class AccessRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DD obj  =new DD();
		obj.print(200);
		WW ww = new WW();
		System.out.println(ww.s);
		//WW obj = new WW();
		//System.out.println(obj.x);
		//System.out.println(obj.y);

	}

}
