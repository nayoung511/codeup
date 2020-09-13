package codeup_1080;

import java.util.Scanner;

public class codeup_1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 0;
		
		while(sum<n) {
			i++;
			sum += i;
		}
		System.out.println(i);
	}

}
