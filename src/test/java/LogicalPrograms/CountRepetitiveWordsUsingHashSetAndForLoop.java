package LogicalPrograms;

import java.util.HashSet;
import java.util.Set;

public class CountRepetitiveWordsUsingHashSetAndForLoop {

    public static void main(String[] args) {

        String str = "What is your name My Name is Rahul hello Rahul kumar and your";

        // Convert to lowercase to avoid case-sensitivity issues
        String[] words = str.toLowerCase().split(" ");
        int count=0;

        Set<String> word = new HashSet<>();
        
        
       for(int i=0; i<words.length; i++) {
    	   
    	   if(word.contains(words[i])) {
    		   count++;
    		   
    		   
    	   }
    	   else
    	   {
    		   word.add(words[i]);
    	   }
       }
       
       System.out.println("repeatative words " + count);
       System.out.println("repeatative words " + words);
    }
}


