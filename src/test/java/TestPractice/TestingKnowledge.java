package TestPractice;

import java.util.Scanner;

public class TestingKnowledge {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char q = sc.next().charAt(0);
//        char[] ch = str.toCharArray();
        int vowCount=0;
        int consCount=0;
        
        for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                
           //     if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                    if(ch==q) {
                	vowCount++;
                }
                else{
                    consCount++;
                }
            }
            
            System.out.println(vowCount);
            System.out.println(consCount);
            
            sc.close();
            
        }
               
}