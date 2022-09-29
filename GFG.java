package javaprog;

import java.util.Scanner;

class GFG
{
static void removeChar(String s, char c)
{
	int j, count = 0, n = s.length();
	char []t = s.toCharArray();
	for (int i = j = 0; i < n; i++)
	{
		if (t[i] != c)
		t[j++] = t[i];
		else
			count++;
	}
	
	while(count > 0)
	{
		t[j++] = '\0';
		count--;
	}
	
	System.out.println(t);
}


public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	String s = sc.nextLine();
	String r = sc.nextLine();
	char rem = r.charAt(0);
	removeChar(s, rem);
}
}

