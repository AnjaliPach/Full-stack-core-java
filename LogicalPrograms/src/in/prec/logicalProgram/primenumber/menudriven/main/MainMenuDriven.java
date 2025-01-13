package in.prec.logicalProgram.primenumber.menudriven.main;

import java.util.Scanner;

import in.prec.logicalProgram.primenumber.menudriven.helper.Helper;

public class MainMenuDriven {
	public static void main(String[] args) {
		int choice=0;
		Scanner scanner= new Scanner(System.in);
		Helper helper= new Helper();
		do {
			choice=helper.printMenu(scanner);
			switch(choice) {
			case1->helper.checkperfect(scanner);
			case2->helper.checkpallindrome(scanner);
			case3->helper.checkaremstrong(scanner);
			case4->helper.checkpallindrome(scanner);
			case0 ->System.out.println("bye");
			default -> System.out.print(false);
			
			
			
			


