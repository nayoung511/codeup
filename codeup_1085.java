import java.text.DecimalFormat;
import java.util.Scanner;

public class codeup_1085 {
	public static double storeCapacity(int h, int b, int c, int s) {
		double storeCapacity = 0;
		
		double sum = h *b;
		sum = sum * c;
		sum = sum * s;
		
		sum = sum/(1024*8*1024);
		//System.out.println(sum);
		
		storeCapacity = (h * b * c * s);
		//System.out.println(storeCapacity);
		
		storeCapacity = storeCapacity/(8*1024*1024);
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h; int b; int c; int s;
		
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		if(h > 48000) {
			System.out.println("wrong input");
		}
		
		b = sc.nextInt();
		if(b > 32 && b%8 !=0) {
			System.out.println("wrong input");
		}
		c = sc.nextInt();
		if(c > 5) {
			System.out.println("wrong input");
		}
		
		s = sc.nextInt();
		if(s > 6000) {
			System.out.println("wrong input");
		}
		
		double result = storeCapacity(h, b, c, s);
				
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(1);
		System.out.println(df.format(result) + " MB");

	}

}
