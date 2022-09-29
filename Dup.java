package javaprog;

import java.util.ArrayList;
import java.util.Scanner;

class Dup {
   public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       
       String input = scanner.nextLine();
      
       Character character = scanner.next().charAt(0);

       System.out.println(removeOccurences(input,character));
   }

   private static String removeOccurences(String input, Character character) {
       ArrayList<Character> al=new ArrayList<>();
       for(int i=0;i<input.length();i++)
       {
           char ch = input.charAt(i);
           if(ch != character)
           {
               al.add(ch);
           }
       }
       StringBuilder stringBuilder=new StringBuilder();
       for(char c:al)
       {
           stringBuilder.append(c);
       }
      return stringBuilder.toString();
   }
}