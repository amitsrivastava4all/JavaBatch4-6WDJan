class SecondDemo
{
// public - now main is accessable outside the package
// static - It will load when class is loaded
// So Class is loaded only once so main is also loaded once
// void - no return 
// String - It is predefine class
// String is a collection of chars
// String is internally a char []
// args is a a variable and it can be anything
// [] - it is a array
// String arr[] = It is a command line argument
// this is the way to take input from the command 
public static void main(String arr[]){
// Integer.parseInt
// Integer is a class and parseInt is a method 
// and this convert String into int
int a =Integer.parseInt(arr[0]);
int b =Integer.parseInt(arr[1]);
int c = a + b;
System.out.println("A is "+a+"\nB is "+b+"\nC is "+c);
System.out.println("Sum is  "+c);
// System - System is a predefine class
// out - out is a object define inside the System
// out is a object of PrintStream class
// println - print new line it is predefine method inside the PrintStream class
// PrintStream - Stream - Flow of Data
// PrintStream u can print on file, console, network
// default PrintStream is printing on console and this binding
// is happen inside the System class
}
}