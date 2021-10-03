package com.sunday.assignments;

public interface PartialInterface {
	
	 void Method1();
     void Method2();
}
abstract class Abc implements PartialInterface{
    public void Method1()
    {
         System.out.println("In  Method 1");
    }

    abstract public void Method3();
}
class Bde extends Abc    //Inherits class A 
{
    public void Method2()
    {
         System.out.println("In Method 2");
    }
    public void Method3()
    {
         System.out.println("In Method 3");
    }
     public static void main(String args[ ])
        {
            Bde b1=new Bde();
            b1.Method1();
            b1.Method2();
            b1.Method3();
        }            

}
