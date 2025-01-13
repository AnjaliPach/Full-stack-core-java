package in.prec.logicalProgram.reverenumber;

public class ReverseNumber {
	int number;
	public ReverseNumber() {}
		public ReverseNumber(int number) {
			this.number=number;
		}
		public void setNumber(int number){
			this.number=number;
		}
		
		public int  getNumber(int number){
			return number;
		}
		public int reverseNumber() {
			int result=0;
			int temp=number;
//			int digit=0;
			while(temp!=0) {
//				digit=number%10;
//				number/=10;
//				System.out.print(digit);
//				digit=number%10;
			result=result*10+temp%10;
			temp/=10;
			}
			System.out.println(result);
			return result;
		}
		public boolean isPalindrome() {
			return(reverseNumber()==number);
//			 int result = reverseNumber();
//			 if(result==number)
//				 return true;
//			 else
//				 return false;
		}
}
		
 
			
			
			
		
		
		
	


