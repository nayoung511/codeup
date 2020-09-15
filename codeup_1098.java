package codeup_1098;

import java.util.Scanner;

public class codeup_1098 {

	public static void main(String[] args) {
		int w, h, n, l, d, x, y;
		Scanner sc = new Scanner(System.in);
		
		w = sc.nextInt();
		h = sc.nextInt();
		
		//create the board
		int arr[][] = new int[w][h];
		
		//get the number of rods
		n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			//get the length, direction, coordinate
			l = sc.nextInt();
			d = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			
			//direction: 0 = horizontal, 1 = vertical
			
			//get the coordinate
			for(int j = 0; j<l; j++) {
				if(d == 0) {	//horizontal
					arr[x-1][y+j-1] = 1;
				}
				if(d == 1) {	//vertical
					arr[x+j-1][y-1] = 1;
				}
			}
		}
	
		for(int i = 0; i<w; i++) {
			for(int j = 0; j<h; j++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
