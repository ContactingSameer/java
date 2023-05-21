import java.util.*;
class maths
{
static float multiply(float x,float y)
{
return (x*y);
}
static float divide (float x,float y)
{
return (x/y);
}
}
class prog7
{
public static void main(String args[])
{
float a=maths.multiply(4.0f,5.0f);
float b=maths.divide(25.0f,5.0f);
System.out.println("A="+a);
System.out.println("B="+b);
}
}