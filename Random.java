public class Random
{
public static void main(String [] args)

{
float rand1 = (float) Math.random();
//Math.Random() is the method to return random number
float rand2 = rand1 * 10;
// random number going upto 10;
int rand3 = (int) Math.ceil(rand2);
//hold the random number here
System.out.println("Basic random is: " +rand1);
System.out.println("Bigger range random is: " +rand2);
System.out.println("Rounded up random is: " +rand3);

//int r = (int) Math.ceil(Math.random() * 10 );
//System.out.println("Another rounded random is: " +r);
for (int i=0; i<10; i++)
{
int r = (int) Math.ceil(Math.random() * 10 );

System.out.println(r);
}
}
}
