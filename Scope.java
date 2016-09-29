public class Scope 
{
//global class variables
static int number =100;
public static void  main(String[] args)
{
int num =250;
System.out.println("Global Number is "+number);
System.out.println("Main Number is "+num);
sub();
}
public static void sub()
{
int num = 1000; //local variables
System.out.println("Global Number is " +number);
System.out.println("sub number is "+num);
}
}

