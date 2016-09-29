public class Equal
{
public static void main(String [] args)
{

String str1 = "Personal Computer";
String str2 = "Computer";
String str3 = str1.substring(9);

String result = str1.equals(str2)?"equal":"inequal";
System.out.println(str1+" and "+str2+" are " +result);
result = str3.equals(str2) ? "equal":"inequal";
System.out.println(str3+ " and " +str2+" are " +result);
}
}
