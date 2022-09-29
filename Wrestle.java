package javaprog;

public class Wrestle {
	public static void main(String[] args) {
		
		String str = "beau tif ul bea ch";
		str=str.replaceAll("\\s+", "");
		String x="";
		//char y="";
		int count=0;
	      char[] carray = str.toCharArray();
	      System.out.println("The string is:" + str);
	      /*System.out.print("Duplicate Characters in above string are:");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	            	 x+=carray[i];
	            	 break;
	            	//count+=1;
	            }
	            
	         }
	         /*char y=carray[i];
	         if(count > 4) {
	        	 if(!(x.contains(Character.toString(y)))) {
	        		 x+=carray[i];
	        	 }
	        	 
	        	 
	         }
	      }*/
	      
	      for(int i = 0;i<str.length();i++) {
	    	  int flag =0;
	    	  for(int j=0;j<str.length();j++) {
	    		  if(str.charAt(i) == str.charAt(j) && i != j) {
	    			  flag =1;
	    			  break;
	    		  }
	    		  
	    		  }
	    	  if(flag == 0) {
    			  x+=str.charAt(i);
	    		  }
	    	  }
	      System.out.println(x);
	      
	      
	      //System.out.println(y);
	}

}
