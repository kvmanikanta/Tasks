package Collections_Demo;

import java.util.HashMap;

public class Hashmap_Demo {

	public static void main(String[] args) {
		HashMap<Integer,String> ll =new HashMap<Integer,String>();
		ll.put(1,"100");
		ll.put(2,"50");// we can also insert based in index 
		ll.put(3,"25");
		ll.put(4,"12");
		ll.put(5,"6");
		System.out.println("Printing using println: "+ll);
		System.out.println("Printing Key Value Pairs");
		for (Integer i : ll.keySet()) {
		      System.out.println("key: " + i + " value: " + ll.get(i));
		    }
		
	
		System.out.println("Printing Values");
		for(String i:ll.values())
		{
			System.out.println(i);
		}

	}

}
