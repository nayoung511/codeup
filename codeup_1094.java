package codeup_1094;

import java.util.Scanner;

public class codeup_1094 {

	public static void main(String[] args) {
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = n-1; i >= 1; i--) {
			System.out.print(arr[i]);
			if(n != 1) {
				System.out.print(" ");
			}
		}
		System.out.println(arr[0]);
	}

}
