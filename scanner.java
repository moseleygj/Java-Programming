import java.util.Scanner;
public class scanner
{
public static void main(String[] args)
{
System.out.println("What would you like to accept as a value?:");
Scanner sc = new Scanner(System.in);
String holder= sc.nextLine();
System.out.println(holder);
System.out.println("What would you like to accept as a value?:");
holder= sc.nextLine();
System.out.println("What would you like to accept as a value?:");
String holder1= sc.nextLine();
System.out.println(holder);
}
}
