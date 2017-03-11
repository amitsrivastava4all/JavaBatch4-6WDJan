
public class VarArgsRule {
	int add(int ...x){
		int sum = 0;
		for(int i : x){
			sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsRule obj = new VarArgsRule();
		System.out.println(obj.add());
		System.out.println(obj.add(10));
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,20,30));
		System.out.println(obj.add(10,20,30,40));
		
		
	}

}
