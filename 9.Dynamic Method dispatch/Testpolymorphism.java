import java.util.*;
class Bank{
float Get_Rate_Of_Interest()
{
return 0;
}
}
class SBI extends Bank{
float Get_Rate_Of_Interest()
{
return 8.4f;
}
}
class ICCI extends Bank{
float Get_Rate_Of_Interest()
{
return 7.3f;
}
}
class AXIS extends Bank{
float Get_Rate_Of_Interest()
{
return 9.7f;
}
}
class Testpolymorphism{
public static void main(String args[])
{
Bank b;
b=new SBI();
System.out.println("SBI Rate of Interest:"+b.Get_Rate_Of_Interest());
b=new ICCI();
System.out.println("ICCI Rate of Interest:"+b.Get_Rate_Of_Interest());
b=new AXIS();
System.out.println("AXIS Rate of Interest:"+b.Get_Rate_Of_Interest());
}
}