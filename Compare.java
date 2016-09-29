public class Compare
{
public static void main(String [] args)
{
int     num1 = 25;
float   num2 = 24.75f;
System.out.println("Least is :"+Math.min(num1,num2));
System.out.println("Most  is :"+Math.max(num1,num2));

int conv = (int) Math.max(num1,num2);

System.out.println("Converted double is " +conv);
}
}
