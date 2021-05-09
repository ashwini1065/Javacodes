package oopsConcepts;

public class ClassA {
	
	public int Salary;
	public String Name;
	public String OrgName;
	int age;
	// Default Constructor
	public ClassA() {
		
		System.out.println("Inside Constructor");
	}
	
	//Parameterized Constructor
	
	public ClassA(int val1,String val2,String val3) {
		
		System.out.println("Inside param Constructor");
	    this.Salary = val1;
	    this.Name = val2;
	    this.OrgName = val3;
	    
		
	}
	
	//methods
	
	public void Display() {
		
		System.out.println("Name of the emp :" + Name);
		System.out.println("Name of the org :" + OrgName);
		System.out.println("Emp salary :" + Salary);
		System.out.println("Emp Age :" + age);
		
	}

}
