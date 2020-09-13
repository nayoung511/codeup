package codeup_1079;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeup_1079 {
	
	public static void main(String[] args) {
		String n; String q = "q";
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			n = sc.next();
			if(n.compareTo(q) == 0)
				break;
			System.out.println(n);
		}
		
		System.out.println("q");
	}
}
