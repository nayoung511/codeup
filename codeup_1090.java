package codeup_1090;

import java.util.Scanner;

public class codeup_1090 {

	public static void main(String[] args) {
		int a = 0; int r = 0; int n = 0;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		r = sc.nextInt();
		n = sc.nextInt();
		
		long result = (long) (a * Math.pow(r, n-1));
		
		System.out.println(result);

	}

}
