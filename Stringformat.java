package javaprog;

import java.util.Scanner;

class StringFormate{
	public void Convert(String s) {
		String [] edited = s.split(":");
		int x = Integer.parseInt(edited[2]);
		if(x >= 500) {
			System.out.println("Student Roll is : "+edited[0]);
			System.out.println("Student Name is :"+edited[1]);
			System.out.println("Student Marks is :"+edited[2]);
			System.out.println("Student Result is: Pass");
		}
		else {
			System.out.println("Student Roll is : "+edited[0]);
			System.out.println("Student Name is :"+edited[1]);
			System.out.println("Student Marks is :"+edited[2]);
			System.out.println("Student Result is: Fail");
		}
		
	}
}


public class Stringformat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringFormate sf = new StringFormate();
		sf.Convert(sc.nextLine());
	}

}


