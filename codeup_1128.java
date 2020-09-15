package codeup_1128;

import java.util.Scanner;

public class codeup_1128 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n < 0 || n > 100)
			System.out.println("error!");
		
		int result = n * 123456789;
		
		System.out.println(result);
	}

}
