
//Each class has a built-in constructor method  that can be used  to create a new insteance of that class
//the program below builds on the previous example to create a new instence of the Car class the assigns it custom values:

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

public class FirstInstance
{
public static void main(String[] args)
{
Car Porsche = new Car();// the constructor method bears the same names as its class name and is invoked with the java"new" keyword
Porsche.color="Red";
Porsche.body="coupe";
System.out.println("Finish Type is : "+Porsche.color);
System.out.println("Body-Type is : "+Porsche.body);
System.out.println(Porsche.accelerate());
}
}

//Tip: Notice that as the Porscheinstance of the Car class is created it inherits all of its attributes and behaviors - this is a vital part of java
