package OOPS_DEMO;

interface InterfaceDemo {
     void printing();                             //abstract method
     default void printName()                     //non abstract i.e default method
        {
	       System.out.println("Welcome to KMK World"); 
	    }
     static int cube(int x)                       //static methods
        {
    	 return x*x*x;
    	}  
}

class Demo implements InterfaceDemo
{
	public void printing()
	{
		System.out.println("Implemented here in Child Class");
	}
}
public class Interface_demo {

	public static void main(String[] args) {
     InterfaceDemo d= new Demo();
     d.printing();
     d.printName();
     System.out.println("Calculated Cube By Static Method"+InterfaceDemo.cube(3));
	}

}
