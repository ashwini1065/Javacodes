package oopsConcepts;

public class MethodOverrideChild extends MethodOverrideParent {
	
public void display (int a,int b) {
		
		int add = a+b;
		System.out.println(add);
		System.out.println("inside child");
	}

}
