package Practice;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("What is your name?");
		
		String name= sca.nextLine();
		System.out.println("My name is: "+ name);
		
		
		
		String address= sca.nextLine();
		System.out.println("My address is: "+ address);
		
		String city=sca.nextLine();
		System.out.println("I live in:"+ city);
		
		int age=sca.nextInt();
		System.out.println("My age is: "+age);
		sca.close();
		
		
	}

}
