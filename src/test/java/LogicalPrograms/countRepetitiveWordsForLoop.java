package LogicalPrograms;

public class countRepetitiveWordsForLoop {
	
	    public static void main(String[] args) {

	        String str = "What is your name My Name is Rahul";

	        // Convert to lowercase to avoid case mismatch
	        str = str.toLowerCase();

	        // Split string into words
	        String[] words = str.split(" ");

	        System.out.println("Repetitive words are:");

	        // Outer loop to pick one word
	        for (int i = 0; i < words.length; i++) {

	            int count = 1;
	            
	            // Skip already counted words
	            if (words[i].equals("visited")) {
	        
	                continue;
	            }

	            // Inner loop to compare with remaining words
	            for (int j = i + 1; j < words.length; j++) {
	                if (words[i].equals(words[j])) {
	                    count++;
	                    words[j] = "visited"; // Mark as counted
	                }
	            }

	            // If word appears more than once
	            if (count > 1) {
	                System.out.println(words[i] + " -> " + count + " times");
	            }
	        }
	    }
	}


