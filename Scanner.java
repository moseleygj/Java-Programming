import java.util.Scanner;
public class Scanner1
{
public static void main(String [] args)
{

//create Scanner using the InputStream available
Scanner scanner = new Scanner(System.in);

//prompt the user
System.out.print("Type some data for the program:\n");

//use the scanner to read a line of text from the user
String input = scanner.nextLine();

//show output
System.out.println("Input: "+input);
}
}
