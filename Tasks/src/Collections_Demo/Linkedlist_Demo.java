package Collections_Demo;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist_Demo {

	public static void main(String[] args) {

		LinkedList<Integer> ll =new LinkedList<Integer>();
		ll.add(100);
		ll.add(0,50);// we can also insert based in index 
		ll.add(25);
		ll.add(12);
		ll.add(6);
		System.out.println("Printing using println: "+ll);
		Iterator<Integer> itr=ll.iterator();
		System.out.println("Printing using Iterator interface");
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		System.out.println("Printing using Enhanced for loop");
		for(int i:ll)
		{
			System.out.println(i);
		}
		
	}

}
