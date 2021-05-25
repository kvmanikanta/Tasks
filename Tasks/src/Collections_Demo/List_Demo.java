package Collections_Demo;

import java.util.*;

public class List_Demo {
public static void main(String[] args)
{
	ArrayList<Integer> arrlist=new ArrayList<Integer>();
	arrlist.add(100);
	arrlist.add(50);
	arrlist.add(25);
	arrlist.add(12);
	arrlist.add(6);
	arrlist.set(1, 999);
	// Printing values in diff types as shown 
	
	//1 Directly printing
	System.out.println("Printing Using Println");
	System.out.println(arrlist);
	
	//2 Using Iterator interface
	System.out.println("Printing Using iterator Inteface");

	Iterator<Integer> itr=arrlist.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("Printing Using Enhanced for loop");
	for(int i:arrlist)
	{
		System.out.println(i);

	}

	
}
}
