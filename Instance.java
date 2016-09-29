public class Instance
{
public static void main(String[] args)
{
Car Diablo = new Car();// the constructor method bears the same names as its class name and is invoked with the java"new" keyword
Diablo.color="yellow";
Diablo.motion="Zoom, Zoom!!!";
System.out.println("The "+Diablo.color +" Diablo");

System.out.println("went "+ Diablo.accelerate());
}
}
