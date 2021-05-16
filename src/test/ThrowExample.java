package test;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		
		int age = 19;
		if(age<18) {
			
			throw new ArithmeticException("age is not valid");
		}else {
			System.out.println("eligible for voting");
		}
		
		}catch(ArithmeticException e) {
			
			System.out.println("exception handled");
		}
		
	}

}
