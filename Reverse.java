package javaprog;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rev =0;
		int x= sc.nextInt();
		if(x % 2 == 0) {
			System.out.println("Cannot reverse");
		}
		else {
			while(x != 0) {
				int y = x % 10;
				rev = rev * 10 + y;
				 x /= 10;
				
			}
			System.out.println(rev);
			
		}
		
	}

}
