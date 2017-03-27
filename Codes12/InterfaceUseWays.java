@FunctionalInterface  // SAM
interface Calculator
{
	int calculate(int x, int y);
}
// 1st Way
class Classical implements Calculator {

	@Override
	public int calculate(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}
	
}
class VV
{
	void show(){
		System.out.println("VV Show");
	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		Classical obj = new Classical();
		System.out.println(obj.calculate(100, 200));
		if(10>2){
		Calculator cls = new Calculator(){
			@Override
			public int calculate(int x, int y) {
				this.print();
				// TODO Auto-generated method stub
				return x + y;
			}
			void print(){
				System.out.println("this is print...");
			}

		};
		int z = cls.calculate(100, 200);
		System.out.println("Anonymous Class "+z);
		//cls.print();
		}
		// Lambda Expression (Java 8)
		Calculator c = (x,y)->x+y;
		Calculator cc = (x,y)->{
			System.out.println("this is lambda");
			return x + y;
		};
		int z = c.calculate(10, 20);
		System.out.println("Lambda "+z);
		// TODO Auto-generated method stub
		VV obj4 = new VV(){
			@Override
			void show(){
				this.print();
				System.out.println("this is show...");
			}
			void print(){
				System.out.println("this is print...");
			}
		};
		
	}

}
