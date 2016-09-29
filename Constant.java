class Car
{
static final String COLOR = "Blue"; //prevent any subsequent changes to to values that are inittially assigned to them.
}

public class Constant
{
public static void main(String[] args)
{
Car Ford = new Car();
Ford.COLOR = "Red";
System.out.println("Ford Color is "+Ford.COLOR);
}
}
