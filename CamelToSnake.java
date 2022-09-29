package javaprog;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class CamelSnake{
	public String convet(String s) {
		String regx="([a-z])([A-Z]+)";
		String repl = "$1_$2";
		s=s.replaceAll(regx, repl);
		return s;
		
	}
}


class uniquestring{
	public void computefreq(String s){
		String st = s.replaceAll("\\s+","");
		 TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		 for(int i=0;i<st.length();i++) {
			 if(tm.containsKey(st.charAt(i))) {
				 tm.put(st.charAt(i), tm.get(st.charAt(i))+1);
			 }
			 else {
				 tm.put(st.charAt(i), 1);
			 }
		 }
		 String val="";
		 for(Map.Entry<Character, Integer> me : tm.entrySet()) {
			 Character key = me.getKey();
			 for(int j =0;j<(int)me.getValue();j++) {
				 val+="*";
			 }
			 
			 System.out.println(key + " : " + val);
			 val="";
			 
		 }
		
	}
	
	
}

public class CamelToSnake {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	uniquestring us = new uniquestring();
	us.computefreq(sc.nextLine());
	//CamelSnake cs= new CamelSnake();
	//System.out.println(cs.convet(sc.nextLine()));
}
}
