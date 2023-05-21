import java.io.*;
class Grandpa{
public void show(){
System.out.println("This is method of grandpa class");
}
}
class Dad extends Grandpa{
public void show(){
System.out.println("This is method of Dad  class");
}
}
class Me extends Dad{
public void show(){
System.out.println("This is method of my class");
}
}
class family{
public static void main(String args[]){
Grandpa grandpa=new Grandpa();
grandpa.show();
Grandpa Dad=new Dad();
Dad.show();
Grandpa Me=new Me();
Me.show();
}
} 