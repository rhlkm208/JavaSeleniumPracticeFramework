package StringPrograms;

import java.util.HashMap;

public class TotalVowelCountUsingHashMap
{
	    
	    public static void main(String[] args) {
	        
	   String str = "aeiouaeioumnfgh";
	   str = str.toLowerCase();
	   
	   char[] ch = str.toCharArray();
	   int tv=0;
	   
	   HashMap<Character, Integer>vow = new HashMap<>();
	   HashMap<Character, Integer>con = new HashMap<>();
	   
	  for(char c : ch){
	      
	          if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	              vow.put(c,vow.getOrDefault(c,0)+1);
	              tv++;
	          }
	          else{
	              con.put(c,con.getOrDefault(c,0)+1);
	          }
	      }
	      
	      vow.forEach((key, value)->{
	          int tc =0;
	          for(int i=0; i<vow.size(); i++){
	             tc = tc+value;
	          }
	          System.out.println("Total Vowels Count " + tc);
	          
	      });
	   
	      System.out.println("Total Vowels Count -> " + tv);
	        
	}
}