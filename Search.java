public class Search
{
public static void main(String [] args)
{
String str  ="Mail@domain.com";

//string.indexOf("") to search 
int isAt    = str.indexOf("@");
int isDot   = str.indexOf(".");

//if no match is found indexOf returns -1
if ((isAt != -1) && (isDot != -1))
{
System.out.println("Format is valid");
System.out.println("@ found at character: " +isAt);
System.out.println(". found at character: " +isDot);
}
else  System.out.println("Format is invalid");
}
}
