import java.util.Scanner;
public class Lotto
{
public static void main (String[] args)
{
System.out.println("How many sets of numbers would you like to have?: ");
Scanner sc = new Scanner(System.in);
String holder= sc.nextLine();
int result = Integer.parseInt(holder);

//System.out.println("Checker value reutned:"+checker(5));
int d=0;
do{
	System.out.println("-----(set "+d+")-----");
for (int e= 0;e<7;++e)
{int first,second,third,fourth,fifth,sixth;

int a = randomnum();
if (e==0){first = a;}
if (e==1 && a!=first ){second = a;}
if (e==1 && a!=first &&a != second ){third = a;}
if (e==1 && a!=first &&a != second && a != third ){fourth = a;}
if (e==1 && a!=first &&a != second && a != third && a != fourth){fifth = a;}
}
++d;
	}
while (d<result);
results();
}

public static void results()
{
System.out.println(first);
System.out.println(second);
System.out.println(third);
System.out.println(fouth);
System.out.println(fifth);
System.out.println(sixth);
}

public static int randomnum(int randy)
{
int b = (int) Math.ceil(Math.random()*49);
return b;
	}
}
