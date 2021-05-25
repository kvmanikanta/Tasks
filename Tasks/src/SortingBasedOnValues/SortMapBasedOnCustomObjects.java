package SortingBasedOnValues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapBasedOnCustomObjects {

	public static void main(String[] args) {
		Map<Integer,Employee> hm= new HashMap<>();
		hm.put(30533, new Employee(30533,"Manikanta"));
		hm.put(30703, new Employee(30703,"Bhargav"));
		hm.put(30393, new Employee(30393,"Kowshik"));
		hm.put(30484, new Employee(30484,"Sreeram"));
		hm.put(30255, new Employee(30255,"Datta"));
		
		System.out.println("\nOriginal Map Key value pairs :::::::::::\n");
		hm.forEach((a,b)->System.out.println(a+"\t"+b));
		
	    Set<Entry<Integer,Employee>>entrySet=hm.entrySet();
	    
	    List<Entry<Integer,Employee>> list=new ArrayList<>(entrySet);
	    
	    Collections.sort(list, (o1, o2) -> o1.getValue().getEmpName().compareTo(o2.getValue().getEmpName()));
		System.out.println("\nMap Sorted based on Employee Names :::::::::::\n");
		
		list.forEach(a->System.out.println(a.getKey()+"\t" +a.getValue() )); 
		
	}

}
