import java.util.*;
public class SortNames
{
public static void main(String [] args)
{
String [] Names = {"Canibus","Newton","Tesla","Edison","Jay-Z","Elijah Muhammd","King tut","Wu-Tang","Neils Bohr","NASA",};
Arrays.sort(Names);
for (int i = 0; i< Names.length;i++)
{
System.out.println("Element "+i +" "+Names[i]);
}
}
}
