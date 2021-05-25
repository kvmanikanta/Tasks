package ReverseaStringUsingsplit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		String[] s1=s.split(" ");
		System.out.println(Arrays.toString(s1));
		//Converting arrays to List
		List<String> list = Arrays.asList(s1);
        // Reversing the list using Collections.reverse() method
        Collections.reverse(list);
        // Converting list back to Array
        String[] reversedArray = list.toArray(s1);
        // Printing the reverse Array
        System.out.print("Reverse Array : " + Arrays.toString(reversedArray));
		sc.close();
	}

}
