package in.prec.logicalProgram.reverenumber.sacannerDemo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
//		scanner.nextInt();
		System.out.println("enter a integer number");
		int variable=scanner.nextInt();
		System.out.println(variable);
//		String add=scanner.nextLine();
		System.out.println("enter a character");
//		
		char charVariable=scanner.next().charAt(0);
		System.out.println(charVariable);
		scanner.close();
		
			
		}
	

}

