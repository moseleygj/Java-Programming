public class compEnds
{
public static void main(String[] arhs)
{
String [] books = {"Perl in easy steps", "HTML in easy steps","Java in easy steps","javascript in easy steps","gone with the wind"};
int counter1 = 0;
int counter2 = 0;

for (int  i=0;i<books.length;++i)
{
if(books[i].endsWith("in easy Steps")) counter1++;
if(books[i].startsWith("Java")) counter2++;
}
System.out.println("Search found...");
System.out.println(counter1+ " Computer \"Steps\" Books.");
System.out.println(counter2+ " Books about java.");
}
}
//.startsWith("") and .endsWith("String")
