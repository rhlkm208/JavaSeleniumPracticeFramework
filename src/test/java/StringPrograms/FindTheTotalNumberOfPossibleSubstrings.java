package StringPrograms;

public class FindTheTotalNumberOfPossibleSubstrings 
{
    public static void main(String[] args) {
    	
 //   	Formula :- n * (n + 1) / 2
 //   	Output :-  3 * (3 + 1) / 2 = 6
    	
       String str = "abc";

        for(int i=0; i<str.length(); i++){

            for(int j=i+1; j<=str.length(); j++){

                System.out.println(str.substring(i, j));

            }
        }
    }
}