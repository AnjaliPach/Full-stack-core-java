package in.prec.logicalProgram.primenumber.perfectNumber.Main;

import in.prec.logicalProgram.primenumber.perfectNumber.PerfectNumber;

public class MainPerfectNumber {
	public static void main(String[] args) {
		PerfectNumber number=new PerfectNumber();
		int variable=280;
		number.setNumber(variable);
		if(number.isPerfectNumber())
			System.out.println(variable + " is a perfect  number");
		else
			System.out.println(variable + " is a  not perfect number ");
	}

}
