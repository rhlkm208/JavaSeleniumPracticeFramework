package JavaInterviewLogicalPrograms;

import java.util.Random;

public class GenerateAlternatingCaseRandomString {
	

	    public static void main(String[] args) {

	        int length = 5;

	        String upperCase = "RAHUL";
	        String lowerCase = "rahul";

	        Random random = new Random();
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < length; i++) {

	            if (i % 2 == 0) {
	                // Even index → Capital letter
	                result.append(upperCase.charAt(random.nextInt(upperCase.length())));
	            } else {
	                // Odd index → Small letter
	                result.append(lowerCase.charAt(random.nextInt(lowerCase.length())));
	            }
	        }

	        System.out.println("Random String: " + result);
	        
	        
	        
	        String upperCase1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String lowerCase1 = "abcdefghijklmnopqrstuvwxyz";
	        
	        
	        Random ran = new Random();
	        StringBuilder strbuild = new StringBuilder();
	        int length1=7;
	        
	        for(int i=0; i<length1; i++) {
	        	if(i%2==0) {
	        		strbuild.append(upperCase1.charAt(ran.nextInt(upperCase1.length())));
	        	}
	        	else {
	        		strbuild.append(lowerCase1.charAt(ran.nextInt(lowerCase1.length())));
	        	}
	        }
	    
	        System.out.println("Random String: " + strbuild);
	    }
	    
	}



