
public class AddFunctionality {
//	public int add(int x, int y){
//		if(x<0 || y<0){
//			return 0;
//		}
//		return x + y;
//	}
	public int result(int w){
		if(w>100){
			throw new ArithmeticException();
		}
		return w;
	}
	public static int add(Object ...x){
		int sum = 0;
		int num = 0;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(Object i : x){
			
			try{
				num = Integer.parseInt(i.toString());
				if(num<0){
					return 0;
				}
			}
			catch(NumberFormatException e){
				num  = 0;
			}
			sum = sum + num;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add("ten",10));
		System.out.println(add("ten","two"));
		System.out.println(add("20",10,100,"200"));
		System.out.println(add("20",10,"200",100));
		
		
	}

}
