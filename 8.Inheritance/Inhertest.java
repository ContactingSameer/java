import java.util.*;
class Room
{
int length,breadth;
Room(int x,int y)
{
length =x;
breadth= y;
}
int Area()
{
return (length *breadth);
}
}
class Bedroom extends Room
{
int height;
Bedroom( int x,int y,int z)
{
super(x,y);
height=z;
}
int Volume()
{
return (length*breadth* height);
}
}

class Inhertest
{
public static void main(String args[])
{
Bedroom R=new Bedroom(10,15,20);
int a=R.Area();
int v=R.Volume();
System.out.println("Area="+a);
System.out.println("Volume="+v);
}
}