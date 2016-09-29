public class functions
{
public static void main (String[] args)
{
int age =39;
dob(age);
int a=add(age);
int sumF= sum(10000000,999);
System.out.println(a);
System.out.println(sumF);
String[] Presidents={"Barak Obama(8)","George Bursh jr(8)","Bill Clintion"};



int d=0;
do{
		System.out.println("-----(set)-----");

for (int e= 0;e<6;++e)
{
int b = (int) Math.ceil(Math.random()*49);
System.out.println(b);
}
++d;
}
while (d<100);
}
public static void dob(int howold)
{
	//send a single interget with no return value
	System.out.println("How old am I?");
	System.out.println("You are "+howold+" years old");
	}
	
	public static int add(int addition)
	{//perform basic math operation
		return addition + 20;
		
	}
	
	public static int sum(int sum1, int sum2)
	{
		//passing multiple ints
	int a= sum1+sum2;
		return a;
	}
	
	

}
