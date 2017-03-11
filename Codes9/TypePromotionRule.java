/*
 * start with int
 * if int is not there ,so it look for wide types
 * if wide type not there , then look for same wrapper
 * if wrapper no there , so look for var args
 * 
 */
class TypePromotionDemo{
	void show(int ...x){
		System.out.println("Var Args Call");
	}
//	void show(Integer x){
//		System.out.println("Integer Wrapper Show...");
//	}
//	void show(int x){
//		System.out.println("int show");
//	}
	void show(byte x){
		System.out.println("byte show");
	}
//	void show(long x){
//		System.out.println("long show");
//	}
//	void show(double x){
//		System.out.println("double show");
//	}
}
public class TypePromotionRule {

	public static void main(String[] args) {
		// Wrapper Types
		Integer p = new Integer(1000);
		p++;
		int pp = 1000;
		pp++;
		
		
		// TODO Auto-generated method stub
		TypePromotionDemo obj = new TypePromotionDemo();
		//obj.show((byte)1);
		obj.show(1000);
	}

}
