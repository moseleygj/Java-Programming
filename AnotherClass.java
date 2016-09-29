//classes can be added to an original file containing the class bearing the main methof if they are not decleared without the "public" keyword access modifier
public class AnotherClass
{
static String str= "Useful to Define Objects";

public static void greeting()
{
System.out.println("Hello from Another Class");
}
}

public class MainClass
{
public static void main(String[] args)
{

System.out.println("Hello from the Main class");

AnotherClass.greeting();
System.out.println(AnotherClass.str);

}
}
