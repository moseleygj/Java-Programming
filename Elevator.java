public class Elevator
{
static int i;
static int floor;
static int floor1;
public static void main (String[] args)
{
floor = (int) ((Math.random()*18)+1);
floor1 = (int) ((Math.random()*18)+1);

System.out.println("Random Pressed floor:"+ floor);

for (int i=1;i<18;++i){

if ( floor == i)
{
System.out.println("- [■] Floor #" + floor + "[ Active ]");

}
else
{
System.out.println("- [ ] Floor #"+ i + "[ OK ] ");
}

}

}
}

