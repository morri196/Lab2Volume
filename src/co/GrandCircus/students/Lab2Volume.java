package co.GrandCircus.students;

import java.util.Scanner;

public class Lab2Volume {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();//new line for visual
		
		char userInput = 'y';
				
		while (userInput == 'y') {
		
		System.out.println("Please enter length of the room: ");//program will run as long as userInput is y
		double length = scnr.nextDouble();
		System.out.println("Please enter width of the room: ");
			double width = scnr.nextDouble();
		System.out.println("Please enter heigth of the room: ");
			double height = scnr.nextDouble();
		
		double roomVolume = length * width * height;
		double roomArea = length * width;
		double roomPerimeter = 2 * (length + width);
		
		System.out.println("The rooms volume is: " + roomVolume);	
		System.out.println("The rooms area is: " + roomArea);
		System.out.println("The rooms perimeter is: " + roomPerimeter);
		
		System.out.println();//just a new line for visual	
		
		System.out.println("Continue? (y/n): " );
		userInput = scnr.next() .charAt(0);
		}
		
		System.out.println();//program ends when userInput is no longer y
	}
}
