import java.util.LinkedList;
import java.math.BigDecimal;
strictfp class SecondClass{
// IEEE - 754 Standard
public static void main(){
System.out.println("My Main Method ");
}

// public - now it is access outside the folder (package)
// static - It will load when class is loaded
// void - no return 
// String - It is a predefine class
// it represent char []
// args is a variable , [] array
// String arr[] - Command Line Arguments
// 1.5 var args
static public  void main(String ...arr){

// Primitive Types or Value Type
byte y ; // 1 byte  8 bit 1 bit +- , 7 bit 
// -2 ^ 7 to 2 ^ 7 -1
// -128 to 127
short t; //2 byte
int x; //4 byte
long tt; // 8 byte
byte ppp = (byte)128;
byte a = 10;
byte b = a;
byte c = (byte)(a + b);
System.out.println("Sum is "+c+" " +ppp);

float pp = 10.20f;  //4 byte
double kkk = 10.20;  // 8 byte

boolean vv = true; // 1 ,2 , 4 byte
char h = 'A'; //2 byte (UNICODE)

// Wrapper Class
Float nn = 10.20f;
Integer ppp1 = 10;
int p11 = 10;

LinkedList l = new LinkedList();
l.add(100);
String msg = "Hello";  // 1 or 0 Memory
//String msg2 = msg;
String msg2 = "Hello";
String msg3 = new String("Hello");  // 2 or 1
if(msg == msg3){
System.out.println("Same Ref ");
}
else
{
System.out.println("Not Same Ref ");
}

if(msg.equals(msg3)){
System.out.println("Same Value");
}
else
{
System.out.println("Not Same Value ");
}

System.out.println(msg+" Java ");
main();


BigDecimal bg = new BigDecimal("10000000");
BigDecimal bg2 = new BigDecimal("20000000");
BigDecimal bg3 = bg.add(bg2);
System.out.println(bg3);

// System - Predefine class
// out - predefine object , this object define in System class
// out is an Object of PrintStream class
// Stream ? - console, file, network
// System class integerate console as channel with Stream
// System - out , in ,err



}
}