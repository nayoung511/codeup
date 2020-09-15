package codeup_1099;

import java.util.Scanner;

public class codeup_1099 {

	public static void main(String[] args) {
		int arr[][] = new int[10][10];
		Scanner sc = new Scanner(System.in);
		

		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int x = 1;
		int y = 1;
		//start point (2,2) ==> (1,1)
		arr[x][y] = 9;
		
		for(x = 1; x<9; x++) {
			for(y = 1; y<9; y++) {
				if(arr[x][y+1] == 0) {
					arr[x][y+1] = 9;
									
				}
				else if(arr[x][y+1] == 1 && arr[x+1][y] !=2) {
					arr[x+1][y] = 9;
					
					x++;
					y--;
				} 
				else if(arr[x][y+1] == 2 || arr[x+1][y] == 2) {
					if(arr[x][y+1] == 2) {
						arr[x][y+1] = 9;
						x = 9; y = 9;
						break;
					}
					if(arr[x+1][y] == 2) {
						arr[x+1][y] = 9;
						
						x = 9; y = 9;
						break;
					}
					break;
				}
			}
		}
		
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}


}
