public class Convert
{
public static void main (String [] args)
{
String  str = "99";
//capitalized Integer.parseInt(data)
//Float.parseFloat

int     num = Integer.parseInt(str);
float   dec = Float.parseFloat(str);

str         = Integer.toString(num);
str         = str.concat(" Red Balloons");

System.out.println("int:"+num);
System.out.println("float:"+dec);
System.out.println("String:"+str);
}
}
