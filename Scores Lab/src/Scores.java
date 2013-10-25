import java.util.Arrays;


public class Scores {
	
	private int[] numbersIn;
	
	Scores(int[] arrIn) {
		numbersIn = arrIn;
	}
	public int[] findEvens(){
		int evenLen = 0;
		int evenIndexTracker = 0;
		for (int i = 0; i < numbersIn.length; i++)
			if (i % 2 == 0)
				evenLen++;
		int[] evens = new int[evenLen]; // must be declared after evenLen is initialized
		
		for (int i = 0; i < numbersIn.length; i++)
			if ((numbersIn[i] % 2 == 0) && numbersIn[i] != 0){
				evens[evenIndexTracker] = numbersIn[i];
				evenIndexTracker++;
			}
		
		return evens;
	}
	public int[] findOdds(){
		int oddLen = 0;
		int oddIndexTracker = 0;
		for (int i = 0; i < numbersIn.length; i++)
			if (i % 2 != 0)
				oddLen++;
		int[] odds = new int[oddLen];	
		
		for (int i = 0; i < numbersIn.length; ++i)
			if ((numbersIn[i] % 2 != 0) && numbersIn[i] != 0){
				odds[oddIndexTracker] = numbersIn[i];
				++oddIndexTracker;
			}
		return odds;
	}
	public double calculateAverage(){
		double avg;
		double sum = 0;
		for(int i = 0; i < numbersIn.length; i++)
			sum += numbersIn[i];
		avg = sum / numbersIn.length;
		
		return avg;
	}
	
	public String toReverseString(){
		String reversed = "";
		for(int i = numbersIn.length - 1; i >= 0; i--)
			reversed += " " + numbersIn[i];
		
		return reversed;
	}
	
	public String toString(){
		String toString = "";
		for(int i = 0; i < numbersIn.length; i++)
			toString += " " + numbersIn[i];
		
		return toString;
	}
	
	public static void main(String args[]){
		int[] score = {1, 2, 3, 4, 5, 6};
		Scores scoreArr = new Scores(score);
		System.out.println(Arrays.toString(scoreArr.findEvens()));
		//System.out.println(scoreArr);
	}
}
