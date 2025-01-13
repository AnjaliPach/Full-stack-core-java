package in.prec.logicalProgram.reverenumber.main;
import in.prec.logicalProgram.reverenumber.ReverseNumber;
public class MainReverseNumber {
	public static void main(String[] args) {
		ReverseNumber number = new ReverseNumber();
		int variable=1214;
		number.setNumber(variable);
		number.reverseNumber();
		int result=number.reverseNumber();
		if(number.isPalindrome()) {
			System.out.print(variable +" is pallindrome number");
		}
			else 
				System.out.print(variable  +  "not pallindrome" );
				
			}
		
	}


