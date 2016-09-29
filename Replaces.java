public class Replaces
{
public static void main(String[] args)
{
String str="                    Borrocudo ";
System.out.println("Oringal String: "+str);
//.trim
str = str.trim();
System.out.println("Trimmed: "+str);

//.charAt(possition);
char let = str.charAt(0);
System.out.println("First Letter: "+let);

//.replace(character1,character2)
str = str.replace('o','a');
System.out.println("Replace characters: "+str);
}
}
