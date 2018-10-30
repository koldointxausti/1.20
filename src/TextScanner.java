import java.util.Scanner;
import java.io.*;
public class TextScanner {
	public static void main(String[] args){
		try {
		// Create an object that will use the name of document that first argument gives
		File document = new File(args[0]);
		// Define a scanner that is going to take information from the file
		//tell the Scanner class which text file we want
        Scanner sc = new Scanner(document);
        //this is a loop that shows the document line by line until it's finished
        while(sc.hasNextLine()) {
        	String i = sc.nextLine();
            System.out.println(i);
		}
        sc.close();
		}
			catch (FileNotFoundException e) {
				System.out.println("You have to enter the path of one text file.");
				System.out.println("You can try with the example I made: example.txt");
			}
		}	
			
		}
		
	
