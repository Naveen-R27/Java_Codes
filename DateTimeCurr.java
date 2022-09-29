package javaprog;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class StringTokens{
	
	public int countto(String s) {
		StringTokenizer txt = new StringTokenizer(s);
		int count = txt.countTokens();
		return count;
		
	}
}


public class DateTimeCurr {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		StringTokens tk = new StringTokens();
		System.out.println(tk.countto(inp));
		String f1 = "10-jun-2000";
		String f2 = "27/11/2000";
		String f3 = "mar 23, 1978";
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getDay());
		Date d2,d3,d4,d5;
		d2=new Date(2018,11,27);
		d3=new Date(2022,11,27);
		System.out.println(d2.after(d3));
		System.out.println(d3.after(d2));
		System.out.println(d2.getTime());
		System.out.println(d2.compareTo(d3));
		SimpleDateFormat df1 = new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat df3 = new SimpleDateFormat("MMM dd, yyyy");
		try {
			d4=df1.parse(f1);
			System.out.println(d4.getDay());
			
			d4=df2.parse(f2);
			System.out.println(d4);

			d4=df3.parse(f3);
			System.out.println(d4);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println(Pattern.matches("^.[ag]", "lagnj"));
		System.out.println(Pattern.matches("al*so", "also"));
		Pattern p = Pattern.compile(".com");
		Matcher m = p.matcher("xyz2gmail.comabc@gmail.com");
		
		while(m.find()) {
			System.out.println(m.start()+" "+(m.end() - 1));
		}


	}

}
