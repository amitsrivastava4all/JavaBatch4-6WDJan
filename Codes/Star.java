class Star
{
public static void main(String arr[]){
// Command Line Arguments
int n = Integer.parseInt(arr[0]);
for(int i = 1; i<=n; i++){
for(int j = 1; j<=i; j++){
System.out.print("*");
}
System.out.println();
}
}
}