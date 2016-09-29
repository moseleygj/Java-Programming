//This will demonstrate the proper use of methods
public class Methods
{
	public static void main(String [] args)
	{
		
birth();
HelloTo("Dumbass");
System.out.println();
HelloTo("Gordon");
HelloTo("Crystal");
square(1000);
int x = returnSomething();
System.out.println(returnSomething());
System.out.println(square(5));
System.out.println(square(x));
System.out.println(Math.PI*returnSomething());
System.out.println(square(returnSomething()*50));
dice();

for (int f=0;f<11;++f)
{
	if (f == 3)
	{
		dice();
	}
	System.out.println(f);
}
//int YEAR = 2016;
	}
	static void birth()
	{
	
		for ( int k=1940; k<2016;k++)
		{
int YEAR = 2016;

			int b=YEAR-k;
if(b < 21)
{
	System.out.println("You're an adolesent, you cant drink or smoke yet!");
}

			
 System.out.println("If you were born in: "+k + " you are :"+b);
		}

		
	}
	static void HelloTo(String name)
	{
 System.out.println("Hello, "+name);
//void mean the function has no return value
	}

	static int returnSomething()
	{
		return 5;
		 
	}

	static int square(int x)
	{
		return x*x;

	}
	static void dice()
	{
		System.out.println(" _____");
		System.out.println("|____ |");
		System.out.println(" ____||");
		System.out.println("|____ |");
		System.out.println(" ____||");
		System.out.println("|_____|");

	}
}