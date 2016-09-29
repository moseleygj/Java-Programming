public class substring
{
public static void main(String [] args)
{
// A substring can be copied from an existing string using.substring
String str = "Java in Easy Steps";
String sub1 = str.substring(0,5);   //"java ",start and end positions
String sub2 = str.substring(4);     // "in easy steps"
int num = 2;
System.out.println("\n\t"+sub1+num+sub2+"\n");
}
}
