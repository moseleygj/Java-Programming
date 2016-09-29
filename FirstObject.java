class Car
{
static String color = "Blue";
static String body = "Saloon";
static String motion = "Vroom, Vroom!";
public static String accelerate()
{
return motion;
}
}
public class FirstObject
{
public static void main(String[] args)
{

System.out.println("Finish Type is : "+Car.color);
System.out.println("Body-Type is : "+Car.body);
System.out.println(Car.accelerate());
}
}
