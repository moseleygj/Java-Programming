//the technique of encapsulation is used in this example
class Car 
{
private String color; ///the private keyword can be used when declearing object varibles to protect their values from being directly changed by external program code. Instead the  object should include a method  that enables the object varible values to be minipulated.
private String body;

public void setCar(String col, String bod)
{
color = col; body = bod;
}

public void describeCar()
{
System.out.println("Finish is " + color);
System.out.println("Body-type is "+body);
}

}
public class SafeInstance
{
public static void main(String[] args)
{
Car Bentley = new Car();
Bentley.setCar("Gold","Saloon");
Bentley.describeCar();
}
}
