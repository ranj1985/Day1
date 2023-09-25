package Practice;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
	
		Random rand= new Random();
		
		int number= rand.nextInt(100)+1;
		System.out.println("Random number is:"+number);
		
		
		
		

	}

}
