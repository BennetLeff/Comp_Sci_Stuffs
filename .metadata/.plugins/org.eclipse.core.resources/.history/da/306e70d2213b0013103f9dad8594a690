// add import statements
import java.util.*;
import java.io.*;

// create class AliceCount
public class AliceCount{

	// create main method - remember to catch the exception
	public static void main(String Args[]) throws FileNotFoundException{
	
		// instantiate Scanner object using text file
		Scanner book = new Scanner(new File("/Users/Bennet/Dropbox/Public/CompSci/src/Alice.txt"));
		
		// instatiate PrintWriter with output file name
		PrintWriter write = new PrintWriter(new FileOutputStream 
				("/Users/Bennet/Dropbox/Public/CompSci/src/output.txt"));
		
		// create variable to track the number of words in the text
		int words = 0;
		
		// create variable to track each of the letters
		int e = 0, t = 0, a = 0, o = 0, i = 0;
		
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
			if (ln.contains("t")) {
				write.println(ln);
				t++;
			}
			if (ln.contains("a")) {
				write.println(ln);
				a++;
			}
			if (ln.contains("o")) {
				write.println(ln);
				o++;
			}
			if (ln.contains("i")) {
				write.println(ln);
				i++;
			}
				// increment the letter counter

				
				// write the word to the output file
			
		
		// calculate the percentage of words containing the character
		}
		System.out.println(e + " "  + t + " "  + a + " "  + o + " "  +i + " " + words);
	
		// close the files
		book.close();
		write.close();
	}	
}