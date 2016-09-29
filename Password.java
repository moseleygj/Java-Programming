public class Password
{
public static void main(String[] args)
{
if (args.length >0)
{
String attempt  = args[0];
//data automatically goes into args[0] array
attempt = attempt.toLowerCase();
if (attempt.equals("bingo"))
System.out.println("password is valid");
else 
System.out.println("Sorry  - Password Invalid");
}
else System.out.println("Please eneter password:");}
}
