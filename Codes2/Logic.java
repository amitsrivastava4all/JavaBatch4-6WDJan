
public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
int arr [] = {932,141,234,400,999};
int sum = 0;
for(int  i = 0; i<arr.length; i++){
	int number = arr[i];
	while(number!=0){
		int rem = number % 10;
		if(rem ==4){
			sum = sum + arr[i];
			
		}
		number = number /10;
	}
}
System.out.println(sum);
		

	}

}
