package JavaInterviewLogicalPrograms;

public class SortWordsWhileUsingLoop {
	
	public static void main(String[] args) {
		String str = "automation selenium framework";
		String[] words = str.split(" ");
		

		for(int i=0; i<words.length-1; i++) {
		    
		    for(int j=i+1; j<words.length; j++){
		        
		        if(words[i].compareTo(words[j])>0){
		            String temp = words[i];
		            words[i]=words[j];
		            words[j] = temp;
		        }
		        
		    }
		}
		
		for (String word : words) {
            System.out.println(word);
        }
		}

}
