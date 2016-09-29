public class ElseDemo
{
public static void main(String[] args)
{
int num = 2; boolean bool = false;
if(num == 2 && bool)
System.out.println("1 is correct");
else 
if (num ==2  && !bool) 
System.out.println("2 is correct");
else
if (num == 2  && !bool)
System.out.println("The expression is true but you will never see this output");
}
}

//nesting ... if(test-expression) do-this; else do-this instead;
