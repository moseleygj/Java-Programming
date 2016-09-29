public class ReturnValue
{
public static void main(String[] args)
{

    int number = 25;
    System.out.println(number+" is "+ sub(number));

    if (sub2(number))
    System.out.println(number+" is above 10");
}

    public static String sub(int num)
    {
    return (num % 2 == 0) ? "even":"odd"; //use return to appropriate value to the caller
    }
// public static data-type function-name(type variable)
    public static boolean sub2(int num)
    {
    return (num > 10) ? true:false;
    }
}

