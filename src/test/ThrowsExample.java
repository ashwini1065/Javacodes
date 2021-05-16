package test;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsExample obj = new ThrowsExample();
		try {
		obj.eligbility(19);
		}catch(ArithmeticException e) {
			
			System.out.println("expection handled");
			
		}
	}
public  void eligbility(int age)  throws ArithmeticException{
	
	if(age<18) {
		
		throw new ArithmeticException("age is not valid");
	}else {
		System.out.println("eligible for voting");
	}
	
}
}
