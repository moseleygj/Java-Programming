public class Conditional
{
public static void main(String[] args)
{
int num1 = 1357, num2 = 12468; //number to test
String result; //varible for result strings

//test first number and assign string
result = ( num1 % 2 !=0 ) ? "Odd" : "Even";
System.out.println( num1 + " is " +result );

//test second number and assign string
result = ( num2 % 2 !=0 ) ? "Odd" : "Even";
System.out.println( num2 + " is " +result );
}
}
