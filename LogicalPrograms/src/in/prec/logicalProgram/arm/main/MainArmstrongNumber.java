package in.prec.logicalProgram.arm.main;

import in.prec.logicalProgram.arm.ArmstrongNumber;

public class MainArmstrongNumber {
	public static void main (String[] args) {
		ArmstrongNumber number=new ArmstrongNumber();
		int variable=153;
		number.setNumber(variable);
		if(number.isARmstrongNumber())
			System.out.println(variable +" is  ArmstrongNumber");
		else
			System.out.println(variable +" is not a  ArmstrongNumber");
			
	}

}
