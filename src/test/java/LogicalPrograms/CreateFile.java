package LogicalPrograms;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args)  {			
			String path = "C://Users//rahulkumar02//Desktop//QA Interview Materials//abcd1.text";

			File f = new File(path);
			
			
			try {
				if(f.exists())
					System.out.println("File exist");
				
				if(f.createNewFile()) {
					System.out.println("New File is created");
				}
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		 
		}

	}
