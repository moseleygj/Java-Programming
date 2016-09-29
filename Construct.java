class Car
{
public String color, body;
public int  doors;
public boolean goodsVehicle;

public Car()
{
color = "silver";
body ="Sports";
doors =2;
goodsVehicle = false;
}
}
public class Construct
{
public static void main(String[] args)
{
Car Boxster =  new Car();
System.out.println("Boxster is " +Boxster.color);
System.out.print(" " + Boxster.body);

System.out.print(" " + Boxster.doors + " - doors\n\n");
}
}
