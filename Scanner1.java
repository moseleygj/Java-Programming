import java.util.Scanner;
public class Scanner1
{
public static void main(String [] args)
{

//1. create Scanner using the InputStream available
Scanner scanner = new Scanner(System.in);

//2.prompt the user
System.out.print("Type some data for the program:\n");

//3.use the scanner to read a line of text from the user. .nextLine();
String input = scanner.nextLine();

//show output
System.out.println("Input: "+input);
System.out.println("add more date: ");
String input1 = scanner.nextLine();
System.out.println("Input1: "+input +"input 2:"+input1);


}
}
