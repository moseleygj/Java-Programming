//Method OverLoading: A class may contain several methods bearing the same name if they each have different argument data typess or require a different number of arguments to be passed. This useful feature is called "Methos overloading" and is used in  this program with three methos named "write".

//Tip: only use this technique for methos that have a related purpose - otherwise use different methids names as usual
public class OverLoad
{

public static void main(String[] args)
{
System.out.println(write(12));
System.out.println(write("Twelve"));
System.out.println(write(4,16));
}

public static String write(String num)
{
return ("String passed is "+num);
}

public static String write(int num)
{
return("interger passed is "+num);
}

public static String write(int num, int another)
{
return ("sum Total is "+(num*another));
}
}
