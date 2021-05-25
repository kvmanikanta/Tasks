package OOPS_DEMO;

abstract class Epam
{
	abstract void Designation();
	void status(){                          // non abstract methods
		System.out.println("Status: EPAMer");
	}  
}
class Manager extends Epam
{
	void Designation()
	{
		System.out.println("In an Manager Position");
	}
}
class Employee extends Epam
{
	void Designation()
	{
		System.out.println("In an Employee Position");
	}
}

public class Abstraction_demo {
public static void main(String[] args)
{
	Epam e=new Manager();
	e.Designation();
	e.status();
	Epam e1= new Employee();
	e1.Designation();
    e1.status();
}
}
