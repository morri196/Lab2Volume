package co.GrandCircus.students;

import java.util.Scanner;

public class Lab2Volume {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		
		char userInput = 'y';
				//making this comment just to make a change bc david told me to.
		while (userInput == 'y') {
		
		System.out.println("Please enter length of the room: ");
		double length = scnr.nextDouble();
		System.out.println("Please enter width of the room: ");
			double width = scnr.nextDouble();
		System.out.println("Please enter heigth of the room: ");
			double height = scnr.nextDouble();
		
		double roomVolume = length * width * height;
				
		System.out.println("The rooms volume is: " + roomVolume);
		
		System.out.println();
		
		System.out.println("Continue? (y/n): " );
		userInput = scnr.next() .charAt(0);
		}
		
		System.out.println();
	}
}
