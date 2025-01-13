package in.prec.Operations;
import in.prec.operators.Operators;

public class MainOperators {
	public static void main(String[] args) {
		Operators oprator = new Operators();
		Operators operators2 = new Operators();
//		((Operators) operators2).setNumber111(10);
		Operators operators = new Operators();
		operators.setNumber2(20);
		Object operator = null;
		int  result= ((Operators) operator).performAddition();
		System.out.println(result);
		
	}

}
