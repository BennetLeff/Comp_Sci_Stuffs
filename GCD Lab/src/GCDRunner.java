//import Scanner
import java.util.Scanner;

public class GCDRunner
{
	//main method
	public static void main(String[] args)
	{
		//instantiate Scanner object
		Scanner scan = new Scanner(System.in);
		
		//prompt user for numerator
		System.out.println("Please input a numerator");
		
		//assign user input to variable
		int a = scan.nextInt();
		
		//prompt user for denominator
		System.out.println("Please input a denominator");
		
		//assign user input to variable
		int b = scan.nextInt();
		
		//instantiate GCD object
		GCD grcom = new GCD(a, b);
		
		//call toString() method
		System.out.println(grcom);
		scan.close();
	}
}