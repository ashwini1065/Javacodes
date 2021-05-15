package oopsConcepts;

public class MethodOverloading {
	
	public void add(int a, int b) {
		
		int sum = a+b;
		
	System.out.println(sum);
	
	
	}
	
	public void add(double a, double b) {
		
		double sum = a+b;
		
		System.out.println(sum);
		
	}
	
	public void add(float a,float b) {
		float sum = a+b;
		System.out.println(sum);
	}

	public void add(char a, char b) {
		char sum = (char) (a+b);
		System.out.println(sum);
	}




}
