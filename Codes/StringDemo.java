class StringDemo
{
public static void main(String args[]){
	String name = "amit";  //1 or 0
	String name2 = "amit";
	String name3 = "amit";
	String name4 = new String("ram");  // 2 or 1
	name = "shyam";
	name = "mike";
	System.out.println(name+" "+ name2);
	Long startTime = System.currentTimeMillis();
	for(int i = 1; i<=100000; i++){
	System.out.println(i);
	}
	Long endTime = System.currentTimeMillis();
	System.out.println(endTime-startTime);
	
}
}