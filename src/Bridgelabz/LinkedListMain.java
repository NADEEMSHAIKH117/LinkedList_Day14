package Bridgelabz;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		System.out.println("Welcome to LinkedList Code !! ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press '1' to add the data at the start");
		System.out.println("Press '2' to add the data at the end");
        switch (scanner.nextInt()) {
        	case 1:
        		Operations.addDataAtStart();
        		break;
        	case 2:
        		Operations.addDataAtEnd();
        		break;
        	}
        }
        
	}
	
