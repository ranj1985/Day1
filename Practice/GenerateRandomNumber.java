package Practice;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumber {

	public static void main(String[] args) {

		// type 1: using Random class
		
		Random rand = new Random();  
		
		// generate random integers in range 0 to 100
		int num1= rand.nextInt(100)+1;
		                                               
		
		
		//print random integers
		System.out.println("Random number is:" +num1);
		
		double num2= rand.nextDouble();
		System.out.println("Double number is:" + num2);
		
		
		// Type 2: using math class , using math class by default generate decimal number
		// in math class we don't need to create object of class
		// this  math.random() method will generate only double values
		
		System.out.println(Math.random());
		
		
		// type 3: Apache commons -lang API, we can generate both random numbers and String 
		
		// for this method we have to download jar file and add into project
		// http://commons.apache.org/
		
		String randNum= RandomStringUtils.randomNumeric(5);// if i write 5 that will generate 5 digit number. if you need generate 10 or anyother number you can change
		
		System.out.println(randNum);
		
		//generating String
		
		String randomString= RandomStringUtils.randomAlphabetic(5);// it will generate 5 char String
		System.out.println(randomString);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
