package in.prec.logicalProgram.primenumber;

public class PrimeNumber {
	int number;
	public PrimeNumber() {}
	public PrimeNumber(int number) {
		 this.number=number;
	}
		
	public void setNumber() {
		this.number=number;
		
	}
	public int getNumber() {
		return number;
	}
	public boolean isPrimeNumber() {
		boolean isPrime=true;
		for(int i=2;i*i<=number;i++)
			if(number%i==0) {
				return false;
			}
//				isPrime=true;
//				break;
			
		return true;
//		if(isPrime)
//			return true;
//		else
//			return false;
//	}

}
}
