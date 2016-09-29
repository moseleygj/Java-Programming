public class Concat
{
public static void main(String[] args)
{
String [] nums = {"97","98.6","99"};
String str1 = "Although ";
String str2 = " F";
String str3 = " is citied as  \"body temperature\"\n";
String str4 = "true";
String str5 = " range is from about ";
String str6 = " to ";

str1=str1+nums[1];
str1 = str1+str2;
str1+=str3;
str4=str4+str5;
str4 += nums[0] + str6 + nums[2] + str2;
System.out.println(str1.concat(str4));
}
}
//.concat(string) can be used or "+"
