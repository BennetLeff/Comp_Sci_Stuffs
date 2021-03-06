// add import statements
import java.util.*;
import java.io.*;

// create class AliceCount
public class AliceCount{

	// create main method - remember to catch the exception
	public static void main(String Args[]) throws FileNotFoundException{
	
		// instantiate Scanner object using text file
		Scanner book = new Scanner(new File("C:/Users/S2076073/ClassRepo/Alice Lab/Alice.txt"));
		
		// instantiate PrintWriter with output file name
		PrintWriter write = new PrintWriter(new FileOutputStream 
				("C:/Users/S2076073/ClassRepo/Alice Lab/Output.txt"));
		
		// create variable to track the number of words in the text
		int words = 0;
		
		// create variable to track each of the letters
		double e = 0, t = 0, a = 0, o = 0, i = 0;
		
		// loop through the file		
		while (book.hasNextLine()) {
		
			// read in the word one at a time
			String ln = book.next();
			
			// increment the word counter
			++words;
			
			// check to see if the letter occurs in the word
			if (ln.contains("e")) {
				write.println(ln);
				e++;
			}
			else if (ln.contains("t")) {
				write.println(ln);
				t++;
			}
			else if (ln.contains("a")) {
				write.println(ln);
				a++;
			}
			else if (ln.contains("o")) {
				write.println(ln);
				o++;
			}
			else if (ln.contains("i")) {
				write.println(ln);
				i++;
			}
				// increment the letter counter

				
				// write the word to the output file
			
		
		// calculate the percentage of words containing the character
		}
		System.out.println("e% " + Math.round(100 * e / words) + "  t% "  + Math.round(100 * t / words) + 
						   "\na% "  + Math.round(100 * a / words) + "  o%"  + Math.round(100 * o / words) + 
						   "\ni% "  + Math.round(100 * i / words) + "\ntotal count " + words);
	
		// close the files
		book.close();
		write.close();
	}	
}