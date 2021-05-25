package Collections_Demo;

import java.util.HashSet;

public class HashSet_Demo {

	public static void main(String[] args) {
		HashSet<String> bikes = new HashSet<String>();
		bikes.add("Hero Honda");
		bikes.add("Hero honda");
		bikes.add("FZ Bs6");
		bikes.add("Activa");
		bikes.add("Activa");
		bikes.add("FZ Bs4");
		
		System.out.println("Hashset Adds only unique elements");
		System.out.println("Number of unique values:"+bikes.size());
		
		for (String i : bikes) {
			  System.out.println(i);
			}
	}

}
