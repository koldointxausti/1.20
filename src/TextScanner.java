import java.util.Scanner;
import java.io.File;
//we need to import this class also to have an answer if the file we want is not found
import java.io.FileNotFoundException;
public class TextScanner {
	public static void main (String[] args) {
		//we create a new File class object
		File adibide = new File("adibide.txt");
		//if the file is not found the program will skip this and go to the catch
		try {
		//tell the Scanner class which text file we want
	        Scanner sc = new Scanner(adibide);
	        //this is a loop that shows the document line by line until it's finished
	        while(sc.hasNextLine()) {
	        	String i = sc.nextLine();
	            System.out.println(i);
	        }
	        sc.close();
	    }
		//in case the file it's not found it will print that message
	    catch (FileNotFoundException e) {
	        System.out.println("The file is not found.");
	    }
		
	}
}
