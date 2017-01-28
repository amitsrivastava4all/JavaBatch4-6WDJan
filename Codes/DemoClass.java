strictfp class DemoTest
{

public static void main(int x){
System.out.println("this is int main...");
}


public static void main(){
System.out.println("this is no args main...");
}

// main - predefine unit (it is a entry point of every java prg)
// public - it is access outside the package (folder)
// static - it will load when class is loaded
// static thing comes only once
// void = not return type
// String - predefine class
// String - it is collection of chars
// String - internally is char[]
// args - args it is a variable type (array)
// Command Line arguments
// Var - Args (Java 5)

// IEEE - 754 Floating Point Standard
 static public void main(String ...arr){
 // Data Types (Value Data Types or Primitive Data Types)
 byte a = 10;  //1 byte
 // 8 bit , 7 bit number , 1  bit + -
 // 0,1 base 2
 // -2 ^ 7 to 2 ^ 7 -1
 // -128 to 127
 short b = 20; //2 byte
 int c = 40;  //4 byte
 c++;
 int k = c;
 long r = 100;  // 8 byte
 
 
 float p = 20.90f;
 double k11 = 100.2545330;
 
 boolean p1 = true;  //1 byte ,2 byte , 4 byte
 
 char rr = 'A';  //2 Byte (UNICODE)
 
 
 String message= "नमस्ते";
 
// System - Predefine Class
// out - predefine object , object of PrintStream class
// println - print new line
//System.in
//System.err
int t9 = 100;
int t8 = 100;
if(t9 == t8){

}
int p4 = 1000;
String name = "Hello"; //(Ref Types) (String Literal)  // 1 or 0 
String name2 = new String("Hello");
if(name == name2){
System.out.println("Same Ref ");
}
else
{
System.out.println("Not Same Ref ");
}
if(name.equals(name2)){
System.out.println("Same String ");
}
else
{
System.out.println("Not Same String ");
}
//String name2 = name;
System.out.println("Hello Java "+name);
main();
main(10);

}
}