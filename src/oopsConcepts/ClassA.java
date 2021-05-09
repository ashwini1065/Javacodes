package oopsConcepts;

public class ClassA {
	
	public int Salary;
	public String Name;
	protected String OrgName;
	int age;
	
	public ClassA() {
		
		System.out.println("Inside Constructor");
	}
	
	public ClassA(int val1,String val2,String val3) {
		
		System.out.println("Inside param Constructor");
	    Salary = val1;
	    Name = val2;
	    OrgName = val3;
	    
		
	}
	
	public void Display() {
		
		System.out.println("Name of the emp :" + Name);
		System.out.println("Name of the org :" + OrgName);
		System.out.println("Emp salary :" + Salary);
		System.out.println("Emp Age :" + age);
		
	}

}
