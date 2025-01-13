package in.prec.logicalProgram.primenumber.Main;

import in.prec.logicalProgram.primenumber.PrimeNumber;

public class MainPrimeNumber {
	public static void main(String[] args) {
		PrimeNumber number = new PrimeNumber();
		int variable=27;
		number.setNumber();
		if(number.isPrimeNumber())
		System.out.println(variable + " is a prime ");
		else
		
			System.out.println(variable + " is a not prime ");
	}

}
