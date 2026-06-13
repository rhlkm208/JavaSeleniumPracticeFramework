package PracticeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class reverseword {
	
	public static void main(String[] args) throws IOException {
		
	int a = 5;
	
	switch (a) {
	case 1:
		System.out.println("Hello");
	case 2:
		System.out.println("Hi");
	case 3:
		System.out.println("Hey");
	case 5:
		System.out.println("correct");
		break;
	default :
		System.out.println("default");

	}
	
	int num = 12345;
	int rev = 0;
	int rem =0;
	
	while(num>0) {
		
		rem = num%10;
		rev = (rev*10)+rem;
		num = num/10;
		
	}
	System.out.println(rev);
	
		
	 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	    cars[0] = "Opel";
	    System.out.println(cars[0]);
	    System.out.println(Arrays.toString(cars));
	    
	    
	    try (FileOutputStream output = new FileOutputStream("filename.txt")) {
	        output.write("Hello Rahul".getBytes());
	        // no need to call close() here
	        System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("Error writing file.");
	      }
	    
	    File file = new File("filename.txt");
	    boolean fread = file.canRead();
	    boolean fwrite = file.canWrite();
	    System.out.println(fread);
	    System.out.println(fwrite);
	    file.delete();
	    file.createNewFile();
	    file.mkdir();
	    
	    try (FileWriter wfile = new FileWriter("filename.txt", true)) {
			wfile.write("\nkumar");
		} catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	    
	    FileOutputStream fis = new FileOutputStream("fileinputstream.txt");
	    fis.write(345262);
	    fis.write(123);
	    
	    ArrayList<String> carsbrand = new ArrayList<String>();
	    carsbrand.add("Volvo");
	    carsbrand.add("BMW");
	    carsbrand.add("Ford");
	    carsbrand.add("Mazda");
	    
	    Collections.sort(carsbrand);
	    System.out.println(carsbrand);
	    Collections.reverse(carsbrand);
	    System.out.println(carsbrand);
	    Collections.swap(carsbrand, 0, 3);
	    System.out.println(carsbrand);
	    
	    
	    
	}

}
