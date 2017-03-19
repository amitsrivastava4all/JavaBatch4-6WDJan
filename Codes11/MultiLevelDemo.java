
class GrandFather{
int x=10;	
}
class Father extends GrandFather{
	int x = 20;
}
class Son extends Father{
	int x = 30;
	void show(){
		int x = 40;
		int z = ((GrandFather)this).x + ((Father)this).x + this.x+ x;
		System.out.println(z);
	}
}
public class MultiLevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son = new Son();
		son.show();
	}

}
