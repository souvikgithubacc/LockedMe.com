package com.LockedMe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LockedMe {
	public static void main(String s[]) {
	System.out.println("Welcome to the application LockedMe.com" +  "\n"  + "Devloper Name : Mr. Souvik Ghosh");
	SourceCode s1= new SourceCode();
	Scanner sc= new Scanner(System.in);
	boolean running = true;
	while (running) {
	System.out.println("Please choose an option:");
	System.out.println("1. List of existing files");
    System.out.println("2. Add a file");
    System.out.println("3. Delete a file");
    System.out.println("4. Search for a file");
    System.out.println("5. Return to the main context");
    System.out.println("6. Exit the application");
    int choice= sc.nextInt();
	try 
	{
		switch (choice) 
		{
		case 1: s1.retrive();
			break;
		case 2: s1.add();
			break;
		case 3: s1.delete();
			break;
		case 4: s1.searchfile();
			break;
		case 5: running = true;{System.out.println("Returning to the main context....");}
			break;
		case 6: {System.out.println("Sucsessfully exited the application.");System.exit(5);
			break;}
		default:
			{System.out.println("Wrong choice selected. Please try again");}
	}
		}
			catch(InputMismatchException e){
				e.printStackTrace();}
		}					
	}
}
