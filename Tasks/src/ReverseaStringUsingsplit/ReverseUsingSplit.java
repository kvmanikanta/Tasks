package ReverseaStringUsingsplit;

import java.util.Scanner;

public class ReverseUsingSplit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		String[] s1=s.split("");
		for(int i=s1.length-1; i>=0; i--)
        {
            System.out.print(s1[i] + "");
        }
		sc.close();
	}

}
